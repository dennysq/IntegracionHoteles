/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.services;

import com.teamj.arquitectura.integracionhotel.dao.ConsultaDAO;
import com.teamj.arquitectura.integracionhotel.dao.EmpresaDAO;
import com.teamj.arquitectura.integracionhotel.model.Consulta;
import com.teamj.arquitectura.integracionhotel.model.Empresa;
import com.teamj.arquitectura.integracionhotel.util.ConsultaHotelesRequest;
import com.teamj.arquitectura.integracionhotel.util.ConsultaHotelesResponse;
import com.teamj.arquitectura.integracionhotel.util.Habitacion;
import java.math.BigDecimal;
import java.util.ArrayList;
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
public class ConsultaServicio {

    @EJB
    private ConsultaDAO consultaDAO;

    @EJB
    private EmpresaDAO empresaDAO;

    public List<ConsultaHotelesResponse> consultaHotel(ConsultaHotelesRequest con) {
        boolean flag = false;
        List<Empresa> listaEmpresas = new ArrayList<>();
        Empresa empresa=new Empresa();
        
        empresa.setCiudad("Manta");
        listaEmpresas=empresaDAO.find(empresa);
        
        if (listaEmpresas.size()>0) {
            System.out.println(""+listaEmpresas);
            Consulta consulta=new Consulta();
            consulta.setCodigoEmpresa(listaEmpresas.get(0));
            consulta.setDestino(listaEmpresas.get(0).getNombre());
            consulta.setOrigen(con.getNombreUsuario());
            consulta.setConsulta("Pruebas");
            consultaDAO.insert(consulta);
        }
        
        
//        con.setFechaEntrada("");
//        con.setFechaSalida("");
//        con.setCiudad("");
//        con.setNumHabitaciones("");
//        con.setTotalPersonas("");
//        con.setDesayunoIncluido("");

        //llamar al web service de la dalia
        

        ConsultaHotelesResponse consultaResponse = new ConsultaHotelesResponse();
        Habitacion hab1 = new Habitacion();
        Habitacion hab2 = new Habitacion();
        List<Habitacion> habitaciones = new ArrayList();
        List<ConsultaHotelesResponse> respuestaConsulta = new ArrayList();
        
        
        hab1.setCodigo(1);
        hab1.setPrecio(new BigDecimal(30.0));
        hab1.setTipo("Simple");
        habitaciones.add(hab1);

        hab2.setCodigo(2);
        hab2.setPrecio(new BigDecimal(60.0));
        hab2.setTipo("Doble");
        habitaciones.add(hab2);

        consultaResponse.setCodigoHotel(1);
        consultaResponse.setCotizacion(new BigDecimal(90.0));
        consultaResponse.setHabitaciones(habitaciones);
        consultaResponse.setNombreHotel("Ramada");

        respuestaConsulta.add(consultaResponse);
   

        
        return respuestaConsulta;
    }
    
    

}
