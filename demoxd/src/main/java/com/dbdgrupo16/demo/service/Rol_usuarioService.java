package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Rol_usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Rol_usuarioService {
    // Create
    public Rol_usuario crearRol_usuario(Rol_usuario rol_usuario);

    // Update
    public Rol_usuario actualizarRol_usuario(Rol_usuario rol_usuario);

    // Read
    public List<Rol_usuario> getAllRoles_usuario();

    // Read
    public Rol_usuario getRol_usuarioById(Integer id_rol_usuario);

    // Delete
    public Rol_usuario eliminarRol_usuario(Integer id_rol_usuario) throws Exception;
}
