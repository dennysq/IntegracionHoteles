/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.services;

import com.teamj.arquitectura.integracionhotel.dao.EmpresaDAO;
import com.teamj.arquitectura.integracionhotel.dao.ReservaDAO;
import com.teamj.arquitectura.integracionhotel.model.Consulta;
import com.teamj.arquitectura.integracionhotel.model.Empresa;
import com.teamj.arquitectura.integracionhotel.model.Reservas;
import com.teamj.arquitectura.integracionhotel.util.ReservaHotelPeticion;
import com.teamj.arquitectura.integracionhotel.util.ReservaHotelRespuesta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author RICARDO
 */
@LocalBean
@Stateless
public class ReservaSevicio {

    @EJB
    private EmpresaDAO empresaDAO;

    @EJB
    private ReservaDAO reservaDAO;

    public ReservaHotelRespuesta reservaHotel(ReservaHotelPeticion reserva) {
        List<Empresa> listaEmpresas = new ArrayList<>();

        Empresa empresa = new Empresa();

        empresa.setId(1);//reserva.getCodigo();

        listaEmpresas = empresaDAO.find(empresa);

        
        
        if (listaEmpresas.size() > 0) {
            Reservas res = new Reservas();
            res.setCodigoEmpresa(listaEmpresas.get(0));
            res.setOrigen(reserva.getNombreUsuario());
            res.setPrecioTotal(new BigDecimal(60.50));//
            res.setNumReserva(15);
            res.setFechaEntrada(new Date());
            res.setFechaEntrada(new Date());
            reservaDAO.insert(res);
        }

//        con.setFechaEntrada("");
//        con.setFechaSalida("");
//        con.setCiudad("");
//        con.setNumHabitaciones("");
//        con.setTotalPersonas("");
//        con.setDesayunoIncluido("");
        //llamar al web service de la dalia
        ReservaHotelRespuesta reservaRespuesta = new ReservaHotelRespuesta();
        reservaRespuesta.setEstado(true);
        reservaRespuesta.setMensajeError("Fuer reservada sus habitaciones");
        reservaRespuesta.setNumeroReserva(15);

        return reservaRespuesta;
    }
}
