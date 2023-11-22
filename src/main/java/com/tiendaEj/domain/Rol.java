
/*Esta estructura se utiliza en todas las tablas*/

package com.tiendaEj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="rol") // Tiene la tabla "categoría" mapeada
public class Rol implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id                                               // Este elementos se usa como id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // Para el autoincremental
    @Column(name="id_rol")
    private Long idRol;
    private String nombre;
    @Column(name="id_usuario")
    private Long idUsuario;
  
}
