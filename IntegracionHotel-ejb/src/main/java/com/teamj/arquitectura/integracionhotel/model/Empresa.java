/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "empresa")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_E")
    private Integer id;
    
    @Size(min = 1, max = 128)
    @Column(name = "NOMBRE_E", length = 128)
    private String nombre;

    @Size(min = 1, max = 20)
    @Column(name = "TIPO_E", length = 20)
    private String tipo;

    @Size(max = 256)
    @Column(name = "SITO_WEB_E", length = 256)
    private String sitoWeb;

    @Column(name = "CREATED_E")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Size(min = 1, max = 64)
    @Column(name = "EMAIL_E", length = 64)
    private String email;

    @Size(max = 64)
    @Column(name = "CIUDAD_E", length = 64)
    private String ciudad;

    @Size(max = 512)
    @Column(name = "DESCRIPCION_E", length = 512)
    private String descripcion;

    @OneToMany(mappedBy = "codigoEmpresa")
    private List<Consulta> consultas;

    @OneToMany(mappedBy = "codigoEmpresa")
    private List<Reservas> reservas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSitoWeb() {
        return sitoWeb;
    }

    public void setSitoWeb(String sitoWeb) {
        this.sitoWeb = sitoWeb;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Reservas> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservas> reservas) {
        this.reservas = reservas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", sitoWeb=" + sitoWeb + ", created=" + created + ", email=" + email + ", ciudad=" + ciudad + ", descripcion=" + descripcion + ", consultas=" + consultas + ", reservas=" + reservas + '}';
    }

    
}
