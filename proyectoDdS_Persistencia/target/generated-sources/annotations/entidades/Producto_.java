package entidades;

import entidades.Cliente;
import entidades.Pago;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-12T15:30:19", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Float> costo;
    public static volatile SingularAttribute<Producto, Long> id;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile ListAttribute<Producto, Cliente> clientes;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile ListAttribute<Producto, Pago> pagos;
    public static volatile SingularAttribute<Producto, String> urlImagen;

}