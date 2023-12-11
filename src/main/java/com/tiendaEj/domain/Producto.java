
/*Esta estructura se utiliza en todas las tablas*/

package com.tiendaEj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto") // Tiene la tabla "categoría" mapeada
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id                                               // Este elementos se usa como id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // Para el autoincremental
    @Column(name="id_producto")
    private Long idProducto;
    //private Long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
  
    @ManyToOne
    @JoinColumn(name="id_categoria") //Variable de enlace (se comenta idCategoria)
    Categoria categoria;
    
}
