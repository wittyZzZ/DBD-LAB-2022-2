package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Comuna;
import com.dbdgrupo16.demo.repository.ComunaRepository;
import com.dbdgrupo16.demo.service.ComunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunaServiceImpl implements ComunaService {

    @Autowired
    private ComunaRepository comunaRepository;

    // Create
    @Override
    public Comuna crearComuna(Comuna comuna) {
        return comunaRepository.save(comuna);
    }

    // Update
    @Override
    public Comuna actualizarComuna(Comuna comuna) {
        return comunaRepository.save(comuna);
    }

    // Read
    @Override
    public List<Comuna> getAllComunas() {
        return (List<Comuna>) comunaRepository.findAll();
    }

    // Read
    @Override
    public Comuna getComunaById(Integer id_comuna) {
        return comunaRepository.findById(id_comuna).orElse(null);
    }

    // Delete
    @Override
    public Comuna eliminarComuna(Integer id_comuna) throws Exception {
        Comuna deletedComuna = null;
        try {
            deletedComuna = comunaRepository.findById(id_comuna).orElse(null);
            if(deletedComuna == null) {
                throw new Exception("Comuna no disponible");
            }else {
                comunaRepository.deleteById(id_comuna);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedComuna;
    }
}


