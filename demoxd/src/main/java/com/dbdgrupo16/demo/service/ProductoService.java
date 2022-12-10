package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {

    // Create
    public Producto crearProducto(Producto producto);

    //Update
    public Producto actualizarProducto(Producto producto);

    // Read
    public List<Producto> getAllProductos();

    // Read
    public Producto getProductoById(Integer id_producto);

    // Delete
    public Producto eliminarProducto(Integer id_producto) throws Exception;
}

