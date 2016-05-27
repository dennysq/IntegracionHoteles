/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.model;

import java.io.Serializable;
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
@Table(name = "consultas")
public class Consultas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_C")
    private Integer id;
    
    @Column(name = "TIMESTAMP_C")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    
    @Size(min = 1, max = 20)
    @Column(name = "ORIGEN_C", length = 20)
    private String origen;
    
    @Size(min = 1, max = 20)
    @Column(name = "DESTINO_C", length = 20)
    private String destino;
    
    @Size(max = 1024)
    @Column(name = "CONSULTA_C", length = 1024)
    private String consulta;
    
    @JoinColumn(name = "CODIGO_E", referencedColumnName = "CODIGO_E")
    @ManyToOne
    private Empresa codigoEmpresa;

    public Consultas() {
    }

    public Consultas(Integer id) {
        this.id = id;
    }

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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public Empresa getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Empresa codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Consultas other = (Consultas) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consultas{" + "id=" + id + ", timestamp=" + timestamp + ", origen=" + origen + ", destino=" + destino + ", consulta=" + consulta + ", codigoEmpresa=" + codigoEmpresa + '}';
    }
}
