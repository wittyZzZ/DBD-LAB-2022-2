package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Usuario;
import com.dbdgrupo16.demo.models.Usuario_carro_compra;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Usuario_carro_compraService {
    // Create
    public Usuario_carro_compra crearUsuario_carro_compra(Usuario_carro_compra usuario_carro_compra);

    // Update
    public Usuario_carro_compra actualizarUsuario_carro_compra(Usuario_carro_compra usuario_carro_compra);

    // Read
    public List<Usuario_carro_compra> getAllUsuarios_carro_compra();

    // Read
    public Usuario_carro_compra getUsuario_carro_compraById(Integer id_usuario_carro_compra);

    // Delete
    public Usuario_carro_compra eliminarUsuario_carro_compra(Integer id_usuario_carro_compra) throws Exception;
}
