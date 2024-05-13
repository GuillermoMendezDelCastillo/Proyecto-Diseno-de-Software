package entidades;

import entidades.Producto;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-12T15:30:19", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apodo;
    public static volatile SingularAttribute<Cliente, String> correo;
    public static volatile SingularAttribute<Cliente, String> contrasena;
    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile ListAttribute<Cliente, Producto> carrito;
    public static volatile SingularAttribute<Cliente, LocalDate> nacimiento;

}