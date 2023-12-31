
package com.tiendaEj.controller;

import com.tiendaEj.domain.Categoria;
import com.tiendaEj.domain.Producto;
import com.tiendaEj.service.CategoriaService;
import com.tiendaEj.service.ProductoService;
import com.tiendaEj.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/pruebas")
public class PruebasController {
    
    @Autowired
    private ProductoService productoService;
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var productos = productoService.getProducto(false);
        model.addAttribute("productos",productos);
        model.addAttribute("totalProductos",productos.size());
        
        // Para obtener el listado de las categorías
        var categorias = categoriaService.getCategoria(false);
        model.addAttribute("categorias",categorias);
        
        return "/pruebas/listado"; // Nombre del HTML, se encuentra en templates.producto/listado
    }
    
    @GetMapping("/listado/{idCategoria}")
    public String listado(Model model, Categoria categoria) {
        var productos = categoriaService.getCategoria(categoria).getProductos();
        var categorias = categoriaService.getCategoria(false);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("categorias", categorias);
        return "/pruebas/listado";
    }

    @GetMapping("/listado2")
    public String listado2(Model model){
        var productos = productoService.getProducto(false);
        model.addAttribute("productos",productos);        
        return "/pruebas/listado2"; // Nombre del HTML, se encuentra en templates.producto/listado
    }
    
    
    @PostMapping("/query1")
    public String consulta1(
            @RequestParam(value="precioInf") double precioInf,
            @RequestParam(value="precioSup") double precioSup,
            Model model){
        var productos = productoService.consultaQuery(precioInf, precioSup);
        model.addAttribute("productos",productos);        
        return "/pruebas/listado2"; // Nombre del HTML, se encuentra en templates.producto/listado
    }
    
    
    
}
