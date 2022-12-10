package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Producto_carro_compra;
import com.dbdgrupo16.demo.service.Producto_carro_compraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Productos_carro_compra")
public class Producto_carro_compraController {
    @Autowired
    private Producto_carro_compraService producto_carro_compraService;

    @GetMapping
    public ResponseEntity<List<Producto_carro_compra>> getAllProductos_carro_compra() {
        List<Producto_carro_compra> pdc = null;
        try {
            pdc = producto_carro_compraService.getAllProductos_carro_compra();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Producto_carro_compra>>(pdc, HttpStatus.OK);
    }

    @GetMapping("{id_producto_carro_compra}")
    public ResponseEntity<Producto_carro_compra> getProducto_carro_compraById(@PathVariable("id_producto_carro_compra") Integer id_producto_carro_compra) {
        Producto_carro_compra pdc = null;
        try {
            pdc = producto_carro_compraService.getProducto_carro_compraById(id_producto_carro_compra);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto_carro_compra>(pdc,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Producto_carro_compra> crearProducto_carro_compra(@RequestBody Producto_carro_compra producto_carro_compra){
        Producto_carro_compra pdc = null;
        try {
            pdc = producto_carro_compraService.crearProducto_carro_compra(producto_carro_compra);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto_carro_compra>(pdc,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Producto_carro_compra> actualizarProducto_carro_compra(@RequestBody Producto_carro_compra producto_carro_compra){
        Producto_carro_compra pdc = null;
        try {
            pdc = producto_carro_compraService.actualizarProducto_carro_compra(producto_carro_compra);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto_carro_compra>(pdc,HttpStatus.OK);
    }

    @DeleteMapping("{id_producto_carro_compra}")
    public ResponseEntity<Producto_carro_compra> eliminarProducto_carro_compra(@PathVariable("id_producto_carro_compra") Integer id_producto_carro_compra){
        Producto_carro_compra pdc = null;
        try {
            pdc = producto_carro_compraService.eliminarProducto_carro_compra(id_producto_carro_compra);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Producto_carro_compra>(pdc,HttpStatus.OK);
    }
}
