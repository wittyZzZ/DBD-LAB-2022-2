package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Comuna;
import com.dbdgrupo16.demo.models.Region;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComunaService {
    // Create
    public Comuna crearComuna(Comuna comuna);

    // Update
    public Comuna actualizarComuna(Comuna comuna);

    // Read
    public List<Comuna> getAllComunas();

    // Read
    public Comuna getComunaById(Integer id_comuna);

    // Delete
    public Comuna eliminarComuna(Integer id_comuna) throws Exception;
}
