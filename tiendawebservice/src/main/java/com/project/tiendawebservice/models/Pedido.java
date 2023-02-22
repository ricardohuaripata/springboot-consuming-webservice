package com.project.tiendawebservice.models;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    //@ManyToOne
    //@JoinColumn(name = "idUsuario", referencedColumnName = "id")
    //private User user;
    //@Column (insertable = false, updatable = false)
	private int idUsuario;

	private String direccion;
	private String municipio;
	private String provincia;
	private String codigopostal;
	private String telefono;
	private Timestamp fecha;
	private double total;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCodigopostal() {
        return codigopostal;
    }
    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Timestamp getFecha() {
        return fecha;
    }
    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    /*
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    */

}
