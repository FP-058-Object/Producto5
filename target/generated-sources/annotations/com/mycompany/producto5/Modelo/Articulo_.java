package com.mycompany.producto5.Modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-28T11:26:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, Integer> idArticulo;
    public static volatile SingularAttribute<Articulo, String> descripcion;
    public static volatile SingularAttribute<Articulo, String> codigo;
    public static volatile SingularAttribute<Articulo, Double> gastosEnvio;
    public static volatile SingularAttribute<Articulo, Double> precioVenta;
    public static volatile SingularAttribute<Articulo, Integer> tiempoPreparacionMinutos;

}