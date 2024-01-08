
package com.mycompany.producto5.Modelo;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author israel
 */
@Entity
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int idCliente;
    @Basic
    private String email;
    private String nombre;
    private String domicilio;
    private String nif;
    private String tipoCliente;
    private float calcAnual;
    private float descuentoEnv;

    public Cliente(int idCliente,String tipoCliente, String email, String nombre, String domicilio, String nif,float calcAnual,float descuentoEnv) {
        
        this.idCliente=idCliente;
        this.tipoCliente = tipoCliente;
        this.email = email;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.calcAnual=calcAnual;
        this.descuentoEnv=descuentoEnv;
        
        
    }
    public Cliente(){}
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String tipoCliente() {
        // Proporciona la implementación concreta para el método tipoCliente
        return tipoCliente;
    }

    public float calcAnual() {
        // Proporciona la implementación concreta para el método calcAnual
        return calcAnual;
    }

    public float descuentoEnv() {
        // Proporciona la implementación concreta para el método descuentoEnv
        return descuentoEnv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;

    }

    public void setCalcAnual(float calcAnual) {
        this.calcAnual = calcAnual;
    }

    public void setDescuentoEnv(float descuentoEnv) {
        this.descuentoEnv = descuentoEnv;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public float getCalcAnual() {
        return calcAnual;
    }

    public float getDescuentoEnv() {
        return descuentoEnv;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", email=" + email + ", nombre=" + nombre + ", domicilio=" + domicilio + ", nif=" + nif + ", tipoCliente=" + tipoCliente + ", calcAnual=" + calcAnual + ", descuentoEnv=" + descuentoEnv + '}';
    }

  
}
