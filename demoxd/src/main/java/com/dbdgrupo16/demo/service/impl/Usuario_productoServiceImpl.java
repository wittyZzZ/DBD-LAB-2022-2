package com.dbdgrupo16.demo.service.impl;


import com.dbdgrupo16.demo.models.Usuario_producto;
import com.dbdgrupo16.demo.repository.Usuario_productoRepository;
import com.dbdgrupo16.demo.service.Usuario_productoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Usuario_productoServiceImpl implements Usuario_productoService {


    @Autowired
    private Usuario_productoRepository usuario_productoRepository;

    @Override
    public Usuario_producto crearUsuario_producto(Usuario_producto usuario_producto) {
        return usuario_productoRepository.save(usuario_producto);
    }

    @Override
    public Usuario_producto actualizarUsuario_producto(Usuario_producto usuario_producto) {
        return usuario_productoRepository.save(usuario_producto);
    }

    @Override
    public List<Usuario_producto> getAllUsuarios_producto() {
        return (List<Usuario_producto>) usuario_productoRepository.findAll();
    }

    @Override
    public Usuario_producto getUsuario_productoById(Integer id_usuario_producto) {
        return usuario_productoRepository.findById(id_usuario_producto).orElse(null);
    }

    @Override
    public Usuario_producto eliminarUsuario_producto(Integer id_usuario_producto) throws Exception {
        Usuario_producto deletedUsuario_producto = null;
        try {
            deletedUsuario_producto = usuario_productoRepository.findById(id_usuario_producto).orElse(null);
            if(deletedUsuario_producto == null) {
                throw new Exception("Usuario_producto no disponible");
            }else {
                usuario_productoRepository.deleteById(id_usuario_producto);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedUsuario_producto;
    }
}
