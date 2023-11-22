
package com.tiendaEj.service;

import com.tiendaEj.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    public List<Producto> getProducto(boolean activo); // devuelve un arraylist
    
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
    // Lista de productos utilizando un método Query
    public List<Producto> consultaQuery(double precioInf, double precioSup);
}
