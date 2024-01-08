package com.mycompany.producto5.Modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Israel
 */

@Entity
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idPedido;
    @Basic
    private int numeroPedido;
    private int idCliente;
    private String idClaseArticulo;
    private int cantidad;
    private boolean enviado;
    @Temporal(TemporalType.DATE)
    private Date fechaHoraPedido;
    /**
     * CONSTRUCTOR VACIO
     */
    public Pedido() {
    }
   /**
    * Constructor directo.
    * @param idPedido
    * @param numeroPedido
    * @param idCliente
    * @param idClaseArticulo
    * @param cantidad
    * @param fechaHoraPedido 
    */
    public Pedido(int idPedido,int numeroPedido, int idCliente, String idClaseArticulo, int cantidad, Date fechaHoraPedido) {
        
        this.idPedido=idPedido;
        this.numeroPedido = numeroPedido;
        this.idCliente = idCliente;
        this.idClaseArticulo = idClaseArticulo;
        this.cantidad = cantidad;
        this.fechaHoraPedido = fechaHoraPedido;
    }
    /**
     * devuelve idpedido
     * @return 
     */
    public int getIdPedido() {
        return idPedido;
    }
    /**
     * Insertar IdPedido
     * @param idPedido 
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    /**
     * Devuelve idCliente
     * @return 
     */
    public int getIdCliente() {
        return idCliente;
    }
    /**
     * Insertar idCliente
     * @param idCliente 
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    /**
     * Devuelve Clase Articulo 
     * @return String
     */
    public String getIdClaseArticulo() {
        return idClaseArticulo;
    }
    /**
     * Introducir idClaseArticulo
     * @param idClaseArticulo 
     */
    public void setIdClaseArticulo(String idClaseArticulo) {
        this.idClaseArticulo = idClaseArticulo;
    }
    /**
     * Devuelve booleano
     * @return true/false
     */
    public boolean isEnviado() {
        return enviado;
    }
    /**
     * Introducimos booleano
     * @param enviado 
     */
    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    // Otros atributos y constructor
    
    public int getidPedido() {
        return idPedido;
    }
    public void setidPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getidCliente() {
        return idCliente;
    }
  

    public void setidCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getidClaseArticulo() {
        return idClaseArticulo;
    }

    public void setidClaseArticulo(String idClaseArticulo) {
        this.idClaseArticulo = idClaseArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(Date fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", numeroPedido=" + numeroPedido + ", idCliente=" + idCliente + ", idClaseArticulo=" + idClaseArticulo + ", cantidad=" + cantidad + ", fechaHoraPedido=" + fechaHoraPedido + ", enviado=" + enviado + '}';
    }

  
    

    
    private long calcularTiempoTranscurrido(Date fechaPedido) {
        // Obtiene la fecha y hora actual
        Date fechaActual = new Date();

        // Convierte las fechas a objetos Calendar
        Calendar calendarPedido = Calendar.getInstance();
        calendarPedido.setTime(fechaPedido);
        Calendar calendarActual = Calendar.getInstance();
        calendarActual.setTime(fechaActual);

        // Calcula la diferencia en milisegundos
        long diferenciaEnMilisegundos = calendarActual.getTimeInMillis() - calendarPedido.getTimeInMillis();

        // Convierte la diferencia a minutos
        long minutosTranscurridos = diferenciaEnMilisegundos / (60 * 1000);
        
        return minutosTranscurridos;
    }
}
