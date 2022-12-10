package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Administrador_empresa;
import com.dbdgrupo16.demo.repository.Administrador_empresaRepository;
import com.dbdgrupo16.demo.service.Administrador_empresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Administrador_empresaServicempl implements Administrador_empresaService {
    @Autowired
    private Administrador_empresaRepository administrador_empresaRepository;

    // Create
    @Override
    public Administrador_empresa crearAdministrador_empresa(Administrador_empresa administrador_empresa) {
        return administrador_empresaRepository.save(administrador_empresa);
    }

    // Update
    @Override
    public Administrador_empresa actualizarAdministrador_empresa(Administrador_empresa administrador_empresa) {
        return administrador_empresaRepository.save(administrador_empresa);
    }

    // Read
    @Override
    public List<Administrador_empresa> getAllAdministradores_empresas() {
        return (List<Administrador_empresa>) administrador_empresaRepository.findAll();
    }

    // Read
    @Override
    public Administrador_empresa getAdministrador_empresaById(Integer id_administrador_empresa) {
        return administrador_empresaRepository.findById(id_administrador_empresa).orElse(null);
    }

    // Delete
    @Override
    public Administrador_empresa eliminarAdministrador_empresa(Integer id_administrador_empresa) throws Exception {
        Administrador_empresa deletedAdministrador_empresa = null;
        try {
            deletedAdministrador_empresa = administrador_empresaRepository.findById(id_administrador_empresa).orElse(null);
            if(deletedAdministrador_empresa == null) {
                throw new Exception("Administrador_empresa no disponible");
            }else {
                administrador_empresaRepository.deleteById(id_administrador_empresa);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedAdministrador_empresa;
    }
}
