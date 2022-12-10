package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Carro_de_compra;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface Carro_de_compraService {
    //Create
    public Carro_de_compra crearCarro_de_compra(Carro_de_compra carro_de_compra);

    //Update
    public Carro_de_compra actualizarCarro_de_compra(Carro_de_compra carro_de_compra);

    //Read
    public List<Carro_de_compra> getAllCarro_de_compra();

    //Read
    public Carro_de_compra getCarro_de_compraById(Integer id_carro_de_compra);

    //Delete
    public Carro_de_compra eliminarCarro_de_compra(Integer id_carro_de_compra) throws Exception;

}
