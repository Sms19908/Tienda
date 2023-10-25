package com.tiendaEj.dao;

import com.tiendaEj.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    
}
