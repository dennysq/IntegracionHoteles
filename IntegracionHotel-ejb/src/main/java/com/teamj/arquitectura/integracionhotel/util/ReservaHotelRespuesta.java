/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.util;

/**
 *
 * @author RICARDO
 */
public class ReservaHotelRespuesta {
    private boolean estado;
    private Integer numeroReserva;
    private String mensajeError;

    public ReservaHotelRespuesta() {
    }

    public ReservaHotelRespuesta(boolean estado, Integer numeroReserva, String mensajeError) {
        this.estado = estado;
        this.numeroReserva = numeroReserva;
        this.mensajeError = mensajeError;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Integer getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(Integer numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
    
}
