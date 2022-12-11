package com.dbdgrupo16.demo.service;


import com.dbdgrupo16.demo.models.Usuario_producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Usuario_productoService {

    // Create
    public Usuario_producto crearUsuario_producto(Usuario_producto usuario_producto);

    // Update
    public Usuario_producto actualizarUsuario_producto(Usuario_producto usuario_producto);

    // Read
    public List<Usuario_producto> getAllUsuarios_producto();

    // Read
    public Usuario_producto getUsuario_productoById(Integer id_usuario_producto);

    // Delete
    public Usuario_producto eliminarUsuario_producto(Integer id_usuario_producto) throws Exception;

}
