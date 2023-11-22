package com.tiendaEj.dao;

import com.tiendaEj.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    //Lista de productos utilizando un metodo query
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
}
