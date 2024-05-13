package entidades;

import entidades.Cliente;
import entidades.Producto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-12T15:30:19", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Cliente> cliente;
    public static volatile SingularAttribute<Pago, Float> total;
    public static volatile SingularAttribute<Pago, Long> id;
    public static volatile SingularAttribute<Pago, String> metodo;
    public static volatile ListAttribute<Pago, Producto> carrito;

}