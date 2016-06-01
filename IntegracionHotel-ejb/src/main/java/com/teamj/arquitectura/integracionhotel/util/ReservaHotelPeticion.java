/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.util;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author RICARDO
 */
public class ReservaHotelPeticion {
    private Integer codigoHotel;
    private String identificacion;
    private BigDecimal precio;
    private String nombreUsuario;
    private Integer codigoHabitacion;
    private String fechaEntrada;
    private String fechaSalida;

    public ReservaHotelPeticion() {
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
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

    public Integer getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(Integer codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
}
