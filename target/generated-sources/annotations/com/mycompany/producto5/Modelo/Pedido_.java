package com.mycompany.producto5.Modelo;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-28T11:26:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> idCliente;
    public static volatile SingularAttribute<Pedido, String> idClaseArticulo;
    public static volatile SingularAttribute<Pedido, Integer> numeroPedido;
    public static volatile SingularAttribute<Pedido, Boolean> enviado;
    public static volatile SingularAttribute<Pedido, Integer> cantidad;
    public static volatile SingularAttribute<Pedido, Date> fechaHoraPedido;
    public static volatile SingularAttribute<Pedido, Integer> idPedido;

}