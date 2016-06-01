/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.util;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author RICARDO
 */
@XmlType(name = "consultahotelesresponse2")
public class ConsultaHotelesResponse {

    private Integer codigoHotel;
    private String nombreHotel;
    private BigDecimal cotizacion;
    private Integer codigoHabitacion;
    private BigDecimal precioHabitacion;
    private String tipoHabitacion;
    
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

    public BigDecimal getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(BigDecimal cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Integer getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(Integer codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public BigDecimal getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(BigDecimal precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
}
