package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Producto;
import com.dbdgrupo16.demo.repository.ProductoRepository;
import com.dbdgrupo16.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicempl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> getAllProductos() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto getProductoById(Integer id_producto) {return productoRepository.findById(id_producto).orElse(null);
    }

    @Override
    public Producto eliminarProducto(Integer id_producto) throws Exception {
        Producto deletedProducto = null;
        try {
            deletedProducto = productoRepository.findById(id_producto).orElse(null);
            if(deletedProducto == null) {
                throw new Exception("Producto no disponible");
            }else {
                productoRepository.deleteById(id_producto);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedProducto;
    }

}
