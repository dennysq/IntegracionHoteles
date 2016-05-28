/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.util;

import java.util.Date;
import java.util.List;

/**
 *
 * @author RICARDO
 */
public class ReservaHotelPeticion {
    private String codigoHotel;
    private List<Integer> codigosHabitacion;
    private Date fechaEntrada;
    private Date fechaSalida;

    public ReservaHotelPeticion() {
    }

    public ReservaHotelPeticion(String codigoHotel, List<Integer> codigosHabitacion, Date fechaEntrada, Date fechaSalida) {
        this.codigoHotel = codigoHotel;
        this.codigosHabitacion = codigosHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    
    public String getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(String codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public List<Integer> getCodigosHabitacion() {
        return codigosHabitacion;
    }

    public void setCodigosHabitacion(List<Integer> codigosHabitacion) {
        this.codigosHabitacion = codigosHabitacion;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
}
