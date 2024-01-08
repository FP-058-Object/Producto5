
package com.mycompany.producto5.Persistencia;

import com.mycompany.producto5.Modelo.Articulo;
import com.mycompany.producto5.Modelo.Cliente;
import com.mycompany.producto5.Modelo.Pedido;
import com.mycompany.producto5.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Israel
 */
public class ControladoraPersistencia {
    
    ArticuloJpaController articuloJpa= new ArticuloJpaController();
    ClienteJpaController clienteJpa= new ClienteJpaController();
    PedidoJpaController pedidoJpa= new PedidoJpaController();
    /*---------------------------------------Articulo-------------------------*/
    public void crearArticulo(Articulo art) {articuloJpa.create(art);}
    
    public List<Articulo> listaArticulo(){ return articuloJpa.findArticuloEntities();}
    public Articulo findArticuloLast(){return articuloJpa.findLastArticulo();}
    public int contadorArticulos(){return articuloJpa.getArticuloCount();}
    public void eliminarArticuloId(int x){     
        try {
           
            articuloJpa.destroy(x);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Articulo decolverArticuloPorId(int x){  return articuloJpa.findArticulo(x);}
    public void editarArticulo(Articulo art) throws Exception{articuloJpa.edit(art);}
    /*--------------------------------------------------------------------------------------------------------------------------*/
    /*---------------------------------------CLIENTE----------------------------------------------------------------------------*/
    /*--------------------------------------------------------------------------------------------------------------------------*/
    public void crearCliente(Cliente cli) { clienteJpa.create(cli); }
    public Cliente findClienteLast(){return clienteJpa.findLastCliente();}
    public List<Cliente> listaCliente(){ return clienteJpa.findClienteEntities();}
    public Cliente encontrarClientePorEmail(String email){
        
     return clienteJpa.findClienteByEmail(email);
    }
    public int contadorClientes(){return clienteJpa.getClienteCount();}
    public void eliminarClienteId(int x){     
        try {
           
            clienteJpa.destroy(x);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Cliente decolverClientePorId(int x){  return clienteJpa.findCliente(x);}
    public void editarCliente(Cliente art) throws Exception{clienteJpa.edit(art);}
     
     
     
     
     
     
     
    /**---------------------------------PEDIDO----------------------------------**/
     
     public List<Pedido> listaPedido(){ return pedidoJpa.findPedidoEntities();}
    
    public int contadorPedidos(){return pedidoJpa.getPedidoCount();}
    public void eliminarPedidoId(int x){     
        try {
           
            pedidoJpa.destroy(x);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Pedido decolverPedidoPorId(int x){  return pedidoJpa.findPedido(x);}
    public void editarPedido(Pedido art) throws Exception{pedidoJpa.edit(art);}
    
     public Pedido findPedidoLast(){return pedidoJpa.findLastPedido();}
     public void crearPedido(Pedido pedido){
     
        pedidoJpa.create(pedido);
     }
     
}
