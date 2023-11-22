
package com.tiendaEj.service;

import org.springframework.security.core.userdetails.*;

public interface UsuarioDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    
    /*
    se define una función que carge un usuario basado en username
    y hay una excepción si no lo encuentra 
    */
}
