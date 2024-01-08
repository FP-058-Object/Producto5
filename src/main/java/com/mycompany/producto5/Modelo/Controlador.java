/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto5.Modelo;

import com.mycompany.producto5.Persistencia.ControladoraPersistencia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Israel
 */
public class Controlador {
    
    
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    /*----------------------------------------Articulo--------------------------------------*/
    public void crearArticulo(Articulo art){
    
        controlPersis.crearArticulo(art);
    }
      /**
     * Decolver Articulo
     * @param Articulo 
     */
    public List<Articulo> devolverArticulo(){ return controlPersis.listaArticulo(); }
    public int contadorArticulos(){return controlPersis.contadorArticulos();}
    public void eliminarArticuloId(int x){controlPersis.eliminarArticuloId(x);}    
    public Articulo devolverArticuloId(int x){return controlPersis.decolverArticuloPorId(x);}
    public Articulo ultimoArticulo(){return controlPersis.findArticuloLast();}
    public void editarArticulo(Articulo art){
        try {
        controlPersis.editarArticulo(art);
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
   /*----------------------------------------Cliente--------------------------------------*/       
            
    public List<Cliente> devolverCliente(){ return controlPersis.listaCliente(); }
    public int contadorClientes(){return controlPersis.contadorClientes();}
    public void eliminarClienteId(int x){controlPersis.eliminarClienteId(x);}    
    public Cliente devolverClienteId(int x){return controlPersis.decolverClientePorId(x);}
    public Cliente ultimoCliente(){return controlPersis.findClienteLast();}
    public Cliente encontrarClientePorEmail(String email){
       return controlPersis.encontrarClientePorEmail(email);
    }
    public void editarCliente(Cliente cliente){
        try {
        controlPersis.editarCliente(cliente);
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }       
    public void crearCliente(Cliente cli){
    
        controlPersis.crearCliente(cli);
    }
    
   /*----------------------------------------Pedido--------------------------------------*/
    
    public List<Pedido> devolverPedido(){ return controlPersis.listaPedido(); }
     
    public int contadorPedidos(){return controlPersis.contadorPedidos();}
    public void eliminarPedidoId(int x){controlPersis.eliminarPedidoId(x);}    
    public Pedido devolverPedidoId(int x){return controlPersis.decolverPedidoPorId(x);}
    public void editarPedidoPedido(Pedido ped){
       
        try {
           controlPersis.editarPedido(ped);
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }       
    public Pedido ultimoPedido(){return controlPersis.findPedidoLast();}
     public void crearPedido(Pedido ped){
    
       controlPersis.crearPedido(ped);
    }
}
