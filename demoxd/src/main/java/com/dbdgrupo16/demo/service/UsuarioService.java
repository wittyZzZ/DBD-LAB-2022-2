package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    // Create
    public Usuario crearUsuario(Usuario usuario);

    // Update
    public Usuario actualizarUsuario(Usuario usuario);

    // Read
    public List<Usuario> getAllUsuarios();

    // Read
    public Usuario getUsuarioById(Integer id_usuario);

    // Delete
    public Usuario eliminarUsuario(Integer id_usuario) throws Exception;
}
