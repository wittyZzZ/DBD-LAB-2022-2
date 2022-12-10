package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Comuna;
import java.util.List;

public interface ComunaService {
    // Create/Update
    public Comuna crearActualizarComuna(Comuna comuna);

    // Read
    public List<Comuna> getAllComunas();

    // Read
    public Comuna getComunaById(Integer id_comuna);

    // Delete
    public Comuna eliminarComuna(Integer id_comuna) throws Exception;
}
