package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Producto;
import com.dbdgrupo16.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/allProductos")
    public ResponseEntity<List<Producto>> getAllProductos() {
        List<Producto> productos = null;
        try {
            productos = productoService.getAllProductos();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);
    }

    @GetMapping("/getById/{id_producto}")
    public ResponseEntity<Producto> getProductoById(@PathVariable("id_producto") Integer id_producto) {
        Producto productos = null;
        try {
            productos = productoService.getProductoById(id_producto);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto>(productos,HttpStatus.OK);
    }

    @PostMapping("/crearoActualizar")
    public ResponseEntity<Producto> crearActualizarProducto(@RequestBody Producto producto){
        Producto productos = null;
        try {
            productos = productoService.crearActualizarProducto(producto);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto>(productos,HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id_producto}")
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

