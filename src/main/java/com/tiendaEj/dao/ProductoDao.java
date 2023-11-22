
package com.tiendaEj.dao;

import com.tiendaEj.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends JpaRepository<Producto, Long>{
    
// Lista de productos utilizando un método Query
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    // Esto ya es funcional porque usa palabras clave : find by, between; busca 
    // los productos que tienen los precios entre los valores
    // Tiene que escribirse como los atributos en la clase Producto (aun si estan en camelCase)
    
}
