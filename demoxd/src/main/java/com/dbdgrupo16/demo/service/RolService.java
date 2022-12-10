package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Rol;
import java.util.List;

public interface RolService {

    // Create/Update
    public Rol crearActualizarRol(Rol rol);

    // Read
    public List<Rol> getAllRoles();

    // Read
    public Rol getRolById(Integer id_rol);

    // Delete
    public Rol eliminarRol(Integer id_rol) throws Exception;
}
