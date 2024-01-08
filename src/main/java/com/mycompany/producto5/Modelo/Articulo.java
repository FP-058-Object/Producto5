package com.mycompany.producto5.Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Articulo implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idArticulo;
    @Basic
    private String codigo;
    private String descripcion;
    private double precioVenta;
    private double gastosEnvio;
    private int tiempoPreparacionMinutos;

    public Articulo(int idArticulo,String codigo, String descripcion, double precioVenta, double gastosEnvio, int tiempoPreparacionMinutos) {
        this.idArticulo=idArticulo;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.gastosEnvio = gastosEnvio;
        this.tiempoPreparacionMinutos = tiempoPreparacionMinutos;
    }

    public Articulo() {
       
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoPreparacionMinutos() {
        return tiempoPreparacionMinutos;
    }

    public void setTiempoPreparacionMinutos(int tiempoPreparacionMinutos) {
        this.tiempoPreparacionMinutos = tiempoPreparacionMinutos;
    }


    @Override
    public String toString() {
        return "Artículo [ID:  "+idArticulo+",Código: " + codigo + ", Descripción: " + descripcion + ", Precio de Venta: " + precioVenta
                + ", Gastos de Envío: " + gastosEnvio + ", Tiempo de Preparación: " + tiempoPreparacionMinutos + " minutos]";
    }
  
}
