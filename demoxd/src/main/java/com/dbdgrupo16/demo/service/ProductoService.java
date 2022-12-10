package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Producto;
import java.util.List;

public interface ProductoService {
    // Create/Update
    public Producto crearActualizarProducto(Producto producto);

    // Read
    public List<Producto> getAllProductos();

    // Read
    public Producto getProductoById(Integer id_producto);

    // Delete
    public Producto eliminarProducto(Integer id_producto) throws Exception;
}

