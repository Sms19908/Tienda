
/*Esta estructura se utiliza en todas las tablas*/

package com.tiendaEj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="usuario") // Tiene la tabla "categoría" mapeada
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id                                               // Este elementos se usa como id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // Para el autoincremental
    @Column(name="id_usuario")
    private Long idUsuario;
    private String username;    
    private String password;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;    
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name="id_usuario",updatable=false)
    private List<Rol> roles;
  
}
