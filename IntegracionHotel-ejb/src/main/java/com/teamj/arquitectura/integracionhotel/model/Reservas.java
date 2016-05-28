/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author RICARDO
 */
@Entity
@Table(name = "reservas")
public class Reservas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_R")
    private Integer id;
    
    @Column(name = "TIMESTAMP_R")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    
    @Column(name = "FECHA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrada;

    @Column(name = "FECHA_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    
    @Size(min = 1, max = 20)
    @Column(name = "ORIGEN_R", length = 20)
    private String origen;
    
    @Column(name = "PRECIO_TOTAL_R", precision = 8, scale = 2)
    private BigDecimal precioTotal;

    @Column(name = "NUM_RESERVA")
    private Integer numReserva;

    @JoinColumn(name = "CODIGO_E", referencedColumnName = "CODIGO_E")
    @ManyToOne
    private Empresa codigoEmpresa;
    
    

   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
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

    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Integer getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(Integer numReserva) {
        this.numReserva = numReserva;
    }

    public Empresa getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Empresa codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservas other = (Reservas) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservas{" + "id=" + id + ", timestamp=" + timestamp + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", origen=" + origen + ", precioTotal=" + precioTotal + ", numReserva=" + numReserva + ", codigoEmpresa=" + codigoEmpresa + '}';
    }

}
