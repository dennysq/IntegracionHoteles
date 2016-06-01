/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.util;


import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author RICARDO
 */
@XmlType(name = "consultahotelesrequest2")
public class ConsultaHotelesRequest {

    private String fechaEntrada;
    private String fechaSalida;
    private Integer totalPersonas;
    private Integer numHabitaciones;
    private String ciudad;
    private String nombreUsuario;
    private boolean desayunoIncluido;
    

    public ConsultaHotelesRequest() {
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
