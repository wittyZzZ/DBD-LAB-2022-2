package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Usuario;
import java.util.List;

public interface UsuarioService {

    // Create /Update
    public Usuario crearActualizarUsuario(Usuario usuario);

    // Read
    public List<Usuario> getAllUsuarios();

    // Read
    public Usuario getUsuarioById(Integer id_usuario);

    // Delete
    public Usuario eliminarUsuario(Integer id_usuario) throws Exception;
}
