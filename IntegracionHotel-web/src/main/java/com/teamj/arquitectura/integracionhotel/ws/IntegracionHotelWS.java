/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.ws;

import com.teamj.arquitectura.integracionhotel.util.ConsultaHotelesRequest;
import com.teamj.arquitectura.integracionhotel.util.ConsultaHotelesResponse;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author RICARDO
 */
@WebService(serviceName = "IntegracionHotelWS")
public class IntegracionHotelWS {

    @EJB
    private com.teamj.arquitectura.integracionhotel.services.ConsultaServicio ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"
    
    @WebMethod(operationName = "consulta")
    public List<ConsultaHotelesResponse> consulta(@WebParam(name = "parametrosBusqueda") ConsultaHotelesRequest consulta) {
        return ejbRef.consultaHotel(consulta);
    }
    
}
