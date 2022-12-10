package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Direccion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DireccionService {
    // Create
    public Direccion crearDireccion(Direccion direccion);

    // Update
    public Direccion actualizarDireccion(Direccion direccion);

    // Read
    public List<Direccion> getAllDirecciones();

    // Read
    public Direccion getDireccionById(Integer id_direccion);

    // Delete
    public Direccion eliminarDireccion(Integer id_direccion) throws Exception;
}
