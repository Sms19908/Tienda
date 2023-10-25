package com.tiendaEj.service.impl;

import com.tiendaEj.dao.CategoriaDao;
import com.tiendaEj.domain.Categoria;
import com.tiendaEj.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategorias(boolean activo) {
        var categorias = categoriaDao.findAll();

        return categorias;
    }

}
