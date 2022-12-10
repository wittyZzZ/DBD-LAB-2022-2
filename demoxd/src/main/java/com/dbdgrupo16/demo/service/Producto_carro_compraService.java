package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Producto_carro_compra;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Producto_carro_compraService {
    // Create
    public Producto_carro_compra crearProducto_carro_compra(Producto_carro_compra producto_carro_compra);

    // Update
    public Producto_carro_compra actualizarProducto_carro_compra(Producto_carro_compra producto_carro_compra);

    // Read
    public List<Producto_carro_compra> getAllProductos_carro_compra();

    // Read
    public Producto_carro_compra getProducto_carro_compraById(Integer id_producto_carro_compra);

    // Delete
    public Producto_carro_compra eliminarProducto_carro_compra(Integer id_producto_carro_compra) throws Exception;
}
