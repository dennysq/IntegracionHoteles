/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.services;

import com.mycompany.ws.RespDisponibilidad;
import com.mycompany.ws.ServicioWebHotel_Service;
import com.teamj.arquitectura.integracionhotel.dao.ConsultaDAO;
import com.teamj.arquitectura.integracionhotel.dao.EmpresaDAO;
import com.teamj.arquitectura.integracionhotel.dao.ReservaDAO;
import com.teamj.arquitectura.integracionhotel.model.Consulta;
import com.teamj.arquitectura.integracionhotel.model.Empresa;
import com.teamj.arquitectura.integracionhotel.model.Reservas;
import com.teamj.arquitectura.integracionhotel.util.ConsultaHotelesRequest;
import com.teamj.arquitectura.integracionhotel.util.ConsultaHotelesResponse;
import com.teamj.arquitectura.integracionhotel.util.Habitacion;
import com.teamj.arquitectura.integracionhotel.util.ReservaHotelPeticion;
import com.teamj.arquitectura.integracionhotel.util.ReservaHotelRespuesta;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author RICARDO
 */
@LocalBean
@Stateless
public class ConsultaServicio {

    @WebServiceRef
    private ServicioWebHotel_Service service;

    @EJB
    private ConsultaDAO consultaDAO;
    @EJB
    private ReservaDAO reservaDAO;

    @EJB
    private EmpresaDAO empresaDAO;

    public List<ConsultaHotelesResponse> consultaHotel(ConsultaHotelesRequest con) {
        List<Empresa> listaEmpresas = new ArrayList<>();
        Empresa empresa = new Empresa();
        empresa.setCiudad(con.getCiudad());
        listaEmpresas = empresaDAO.find(empresa);
        List<ConsultaHotelesResponse> respuestaConsulta = new ArrayList();
        if (listaEmpresas.size() > 0) {
            for (int i = 0; i < listaEmpresas.size(); i++) {
                System.out.println("" + listaEmpresas);
                Consulta consulta = new Consulta();
                consulta.setCodigoEmpresa(listaEmpresas.get(i));
                consulta.setDestino(listaEmpresas.get(i).getNombre());
                consulta.setOrigen(con.getNombreUsuario());
                consulta.setConsulta("Pruebas");
                consultaDAO.insert(consulta);
                try { // Call Web Service Operation
                    com.mycompany.ws.ServicioWebHotel port = service.getServicioWebHotelPort();
                    // TODO initialize WS operation arguments here
                    java.lang.String fechaEntrada = con.getFechaEntrada();
                    java.lang.String fechaSalida = con.getFechaSalida();
                    java.lang.Integer totalPersonas = con.getTotalPersonas();
                    java.lang.Boolean incluyeDesayuno = con.isDesayunoIncluido();
                    // TODO process result here
                    java.util.List<com.mycompany.ws.RespDisponibilidad> result = port.consultaDisponibilidadDeHabitaciones(fechaEntrada, fechaSalida, totalPersonas, incluyeDesayuno);
                    System.out.println("Result = " + result);
                    for (RespDisponibilidad r : result) {
                        ConsultaHotelesResponse consultaResponse = new ConsultaHotelesResponse();
                        consultaResponse.setCodigoHotel(listaEmpresas.get(i).getId());
                        consultaResponse.setCodigoHabitacion(r.getCodigo());
                        consultaResponse.setPrecioHabitacion(r.getPrecio());
                        consultaResponse.setTipoHabitacion(r.getTipo());
                        consultaResponse.setNombreHotel(listaEmpresas.get(i).getNombre());
                        consultaResponse.setCotizacion(r.getPrecio());
                        respuestaConsulta.add(consultaResponse);
                    }
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
            }
        }
        return respuestaConsulta;
    }

    public ReservaHotelRespuesta reservar(ReservaHotelPeticion peticion) {
        Empresa empresaTemp;

        ReservaHotelRespuesta reservaRespuesta = new ReservaHotelRespuesta();
        try {
            empresaTemp = empresaDAO.findById(peticion.getCodigoHotel(), false);
            //List<ConsultaHotelesResponse> respuestaConsulta = new ArrayList();
            //llamada a web service
            reservaRespuesta.setEstado(true);
            if (reservaRespuesta.isEstado()) {
                Reservas res = new Reservas();
                res.setCodigoEmpresa(empresaTemp);
                res.setOrigen(peticion.getNombreUsuario());
                res.setPrecioTotal(peticion.getPrecio());//
                res.setNumReserva(15);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                res.setFechaEntrada(sdf.parse(peticion.getFechaEntrada()));
                res.setFechaSalida(sdf.parse(peticion.getFechaSalida()));
                reservaDAO.insert(res);
            }
        } catch (ParseException ex) {
            Logger.getLogger(ConsultaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        return reservaRespuesta;
    }
}
