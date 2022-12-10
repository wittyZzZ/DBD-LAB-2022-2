package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Rol;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RolService {

    // Create
    public Rol crearRol(Rol rol);

    // Update
    public Rol actualizarRol(Rol rol);

    // Read
    public List<Rol> getAllRoles();

    // Read
    public Rol getRolById(Integer id_rol);

    // Delete
    public Rol eliminarRol(Integer id_rol) throws Exception;
}
