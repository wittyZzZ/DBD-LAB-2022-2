package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Permiso;
import java.util.List;

public interface PermisoService {

    // Create/Update
    public Permiso crearActualizarPermiso(Permiso permiso);

    // Read
    public List<Permiso> getAllPermisos();

    // Read
    public Permiso getPermisoById(Integer id_permiso);

    // Delete
    public Permiso eliminarPermiso(Integer id_permiso) throws Exception;
}
