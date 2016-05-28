/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.util;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author RICARDO
 */
@XmlType(name = "consultahotelesresponse2")
public class ConsultaHotelesResponse {

    private Integer codigoHotel;
    private String nombreHotel;
    private List<Habitacion> habitaciones;
    private BigDecimal cotizacion;

    public ConsultaHotelesResponse() {
    }

    public Integer getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(Integer codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public BigDecimal getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(BigDecimal cotizacion) {
        this.cotizacion = cotizacion;
    }
}
