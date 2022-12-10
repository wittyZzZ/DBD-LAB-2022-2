package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Permiso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PermisoService {

    // Create
    public Permiso crearPermiso(Permiso permiso);

    // Update
    public Permiso actualizarPermiso(Permiso permiso);

    // Read
    public List<Permiso> getAllPermisos();

    // Read
    public Permiso getPermisoById(Integer id_permiso);

    // Delete
    public Permiso eliminarPermiso(Integer id_permiso) throws Exception;
}
