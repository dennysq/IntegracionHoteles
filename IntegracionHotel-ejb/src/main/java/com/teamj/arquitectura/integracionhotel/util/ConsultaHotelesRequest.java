/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.util;

import java.util.Date;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author RICARDO
 */
@XmlType(name = "consultahotelesrequest2")
public class ConsultaHotelesRequest {

    private Date fechaEntrada;
    private Date fechaSalida;
    private Integer totalPersonas;
    private Integer numHabitaciones;
    private String ciudad;
    private String nombreUsuario;
    private boolean desayunoIncluido;
    

    public ConsultaHotelesRequest() {
    }

    public ConsultaHotelesRequest(Date fechaEntrada, Date fechaSalida, Integer totalPersonas, Integer numHabitaciones, String ciudad, boolean desayunoIncluido) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.totalPersonas = totalPersonas;
        this.numHabitaciones = numHabitaciones;
        this.ciudad = ciudad;
        this.desayunoIncluido = desayunoIncluido;
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

    public Integer getTotalPersonas() {
        return totalPersonas;
    }

    public void setTotalPersonas(Integer totalPersonas) {
        this.totalPersonas = totalPersonas;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
    public boolean isDesayunoIncluido() {
        return desayunoIncluido;
    }

    public void setDesayunoIncluido(boolean desayunoIncluido) {
        this.desayunoIncluido = desayunoIncluido;
    }
}
