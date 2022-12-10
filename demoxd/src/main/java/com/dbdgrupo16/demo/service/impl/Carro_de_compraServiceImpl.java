package com.dbdgrupo16.demo.service.impl;


import com.dbdgrupo16.demo.models.Carro_de_compra;
import com.dbdgrupo16.demo.repository.Carro_de_compraRepository;
import com.dbdgrupo16.demo.service.Carro_de_compraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Carro_de_compraServiceImpl implements Carro_de_compraService{
    @Autowired
    private Carro_de_compraRepository carroDeCompraRepository;
    @Override
    public Carro_de_compra crearCarro_de_compra(Carro_de_compra carro_de_compra){
        return carroDeCompraRepository.save(carro_de_compra);
    }
    @Override
    public Carro_de_compra actualizarCarro_de_compra(Carro_de_compra carro_de_compra){
        return carroDeCompraRepository.save(carro_de_compra);
    }
    @Override
    public List<Carro_de_compra> getAllCarro_de_compra(){
        return (List<Carro_de_compra>) carroDeCompraRepository.findAll();
    }

    @Override
    public Carro_de_compra getCarro_de_compraById(Integer id_carro_de_compra){
        return carroDeCompraRepository.findById(id_carro_de_compra).orElse(null);
    }

    @Override
    public Carro_de_compra eliminarCarro_de_compra(Integer id_carro_de_compra) throws Exception {
        Carro_de_compra deletedCarro_de_compra = null;
        try {
            deletedCarro_de_compra = carroDeCompraRepository.findById(id_carro_de_compra).orElse(null);
            if (deletedCarro_de_compra == null) {
                throw new Exception("Carro de Compra no disponible");
            } else {
                carroDeCompraRepository.deleteById((id_carro_de_compra));
            }
        } catch (Exception ex) {
            throw ex;
        }
        return deletedCarro_de_compra;

    }
}

