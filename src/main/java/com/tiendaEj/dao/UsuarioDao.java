
package com.tiendaEj.dao;

import com.tiendaEj.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {    
    Usuario findByUsername(String username);
    /* Esta es como la de findByPrecio, pero busca entre los nombres de usuario */
}