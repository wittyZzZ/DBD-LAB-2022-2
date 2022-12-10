package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Usuario_carro_compra;
import com.dbdgrupo16.demo.repository.Usuario_carro_compraRepository;
import com.dbdgrupo16.demo.service.Usuario_carro_compraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Usuario_carro_compraServiceImpl implements Usuario_carro_compraService {
    @Autowired
    private Usuario_carro_compraRepository usuario_carro_compraRepository;

    @Override
    public Usuario_carro_compra crearUsuario_carro_compra(Usuario_carro_compra usuario_carro_compra) {
        return usuario_carro_compraRepository.save(usuario_carro_compra);
    }

    @Override
    public Usuario_carro_compra actualizarUsuario_carro_compra(Usuario_carro_compra usuario_carro_compra) {
        return usuario_carro_compraRepository.save(usuario_carro_compra);
    }

    @Override
    public List<Usuario_carro_compra> getAllUsuarios_carro_compra() {
        return (List<Usuario_carro_compra>) usuario_carro_compraRepository.findAll();
    }

    @Override
    public Usuario_carro_compra getUsuario_carro_compraById(Integer id_usuario_carro_compra) {
        return usuario_carro_compraRepository.findById(id_usuario_carro_compra).orElse(null);
    }

    @Override
    public Usuario_carro_compra eliminarUsuario_carro_compra(Integer id_usuario_carro_compra) throws Exception {
        Usuario_carro_compra deletedUsuario_carro_compra = null;
        try {
            deletedUsuario_carro_compra = usuario_carro_compraRepository.findById(id_usuario_carro_compra).orElse(null);
            if(deletedUsuario_carro_compra == null) {
                throw new Exception("Usuario_carro_compra no disponible");
            }else {
                usuario_carro_compraRepository.deleteById(id_usuario_carro_compra);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedUsuario_carro_compra;
    }

}
