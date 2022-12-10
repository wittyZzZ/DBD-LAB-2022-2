package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Producto_carro_compra;
import com.dbdgrupo16.demo.repository.Producto_carro_compraRepository;
import com.dbdgrupo16.demo.service.Producto_carro_compraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Producto_carro_compraServiceImpl implements Producto_carro_compraService {
    @Autowired
    private Producto_carro_compraRepository producto_carro_compraRepository;

    @Override
    public Producto_carro_compra crearProducto_carro_compra(Producto_carro_compra producto_carro_compra) {
        return producto_carro_compraRepository.save(producto_carro_compra);
    }

    @Override
    public Producto_carro_compra actualizarProducto_carro_compra(Producto_carro_compra producto_carro_compra) {
        return producto_carro_compraRepository.save(producto_carro_compra);
    }

    @Override
    public List<Producto_carro_compra> getAllProductos_carro_compra() {
        return (List<Producto_carro_compra>) producto_carro_compraRepository.findAll();
    }

    @Override
    public Producto_carro_compra getProducto_carro_compraById(Integer id_producto_carro_compra) {
        return producto_carro_compraRepository.findById(id_producto_carro_compra).orElse(null);
    }

    @Override
    public Producto_carro_compra eliminarProducto_carro_compra(Integer id_producto_carro_compra) throws Exception {
        Producto_carro_compra deletedProducto_carro_compra = null;
        try {
            deletedProducto_carro_compra = producto_carro_compraRepository.findById(id_producto_carro_compra).orElse(null);
            if(deletedProducto_carro_compra == null) {
                throw new Exception("Producto_carro_compra no disponible");
            }else {
                producto_carro_compraRepository.deleteById(id_producto_carro_compra);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedProducto_carro_compra;
    }
}
