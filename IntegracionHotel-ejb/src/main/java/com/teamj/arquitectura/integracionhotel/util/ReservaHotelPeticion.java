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
    private Integer codigoHotel;
    private String identificacion;
    private String nombreUsuario;
    private List<Integer> codigosHabitacion;
    private Date fechaEntrada;
    private Date fechaSalida;

    public ReservaHotelPeticion() {
    }

    public ReservaHotelPeticion(Integer codigoHotel, String identificacion, String nombreUsuario, List<Integer> codigosHabitacion, Date fechaEntrada, Date fechaSalida) {
        this.codigoHotel = codigoHotel;
        this.identificacion = identificacion;
        this.nombreUsuario = nombreUsuario;
        this.codigosHabitacion = codigosHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Integer getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(Integer codigoHotel) {
        this.codigoHotel = codigoHotel;
    }


    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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
