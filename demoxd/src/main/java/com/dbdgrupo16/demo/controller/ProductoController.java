package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Producto;
import com.dbdgrupo16.demo.models.Region;
import com.dbdgrupo16.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getAllProductos() {
        List<Producto> productos = null;
        try {
            productos = productoService.getAllProductos();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);
    }

    @GetMapping("{id_producto}")
    public ResponseEntity<Producto> getProductoById(@PathVariable("id_producto") Integer id_producto) {
        Producto productos = null;
        try {
            productos = productoService.getProductoById(id_producto);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto>(productos,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto){
        Producto prod = null;
        try {
            prod = productoService.crearProducto(producto);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto>(prod,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Producto> actualizarProducto(@RequestBody Producto producto) {
        Producto prod = null;
        try {
            prod = productoService.actualizarProducto(producto);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto>(prod,HttpStatus.OK);
    }

    @DeleteMapping("{id_producto}")
    public ResponseEntity<Producto> eliminarProducto(@PathVariable("id_producto") Integer id_producto){
        Producto productos = null;
        try {
            productos = productoService.eliminarProducto(id_producto);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto>(productos,HttpStatus.OK);
    }
}

