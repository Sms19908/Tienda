
/*Esta estructura se utiliza en todas las tablas*/

package com.tiendaEj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="categoria") // Tiene la tabla "categoría" mapeada
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id                                               // Este elementos se usa como id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // Para el autoincremental
    @Column(name="id_categoria")
    private Long idCategoria;
    
    private String descripcion;
    private String rutaImagen;
    private Boolean activo;

    @OneToMany
    @JoinColumn(name="id_categoria",updatable=false)
    private List<Producto> productos;
  
}
