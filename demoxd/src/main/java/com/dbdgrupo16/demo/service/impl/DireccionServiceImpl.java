package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Direccion;
import com.dbdgrupo16.demo.repository.DireccionRepository;
import com.dbdgrupo16.demo.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionServiceImpl implements DireccionService {
    @Autowired
    private DireccionRepository direccionRepository;

    // Create
    @Override
    public Direccion crearDireccion(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    // Update
    @Override
    public Direccion actualizarDireccion(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    // Read
    @Override
    public List<Direccion> getAllDirecciones() {
        return (List<Direccion>) direccionRepository.findAll();
    }

    // Read
    @Override
    public Direccion getDireccionById(Integer id_direccion) {
        return direccionRepository.findById(id_direccion).orElse(null);
    }

    // Delete
    @Override
    public Direccion eliminarDireccion(Integer id_direccion) throws Exception {
        Direccion deletedDireccion = null;
        try {
            deletedDireccion = direccionRepository.findById(id_direccion).orElse(null);
            if(deletedDireccion == null) {
                throw new Exception("Direccion no disponible");
            }else {
                direccionRepository.deleteById(id_direccion);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedDireccion;
    }
}

