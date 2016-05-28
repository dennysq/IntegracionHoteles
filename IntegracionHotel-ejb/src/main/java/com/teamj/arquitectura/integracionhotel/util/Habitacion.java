/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.util;

import java.math.BigDecimal;

/**
 *
 * @author RICARDO
 */
public class Habitacion {

    private Integer codigo;
    private BigDecimal precio;
    private String tipo;

    public Habitacion() {
    }

    public Habitacion(Integer codigo, BigDecimal precio, String tipo) {
        this.codigo = codigo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
