package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Empresa;
import com.dbdgrupo16.demo.repository.EmpresaRepository;
import com.dbdgrupo16.demo.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    // Create
    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    // Update
    @Override
    public Empresa actualizarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    // Read
    @Override
    public List<Empresa> getAllEmpresas() {
        return (List<Empresa>) empresaRepository.findAll();
    }

    // Read
    @Override
    public Empresa getEmpresaById(Integer id_empresa) {
        return empresaRepository.findById(id_empresa).orElse(null);
    }

    // Delete
    @Override
    public Empresa eliminarEmpresa(Integer id_empresa) throws Exception {
        Empresa deletedEmpresa = null;
        try {
            deletedEmpresa = empresaRepository.findById(id_empresa).orElse(null);
            if(deletedEmpresa == null) {
                throw new Exception("Empresa no disponible");
            }else {
                empresaRepository.deleteById(id_empresa);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedEmpresa;
    }
}
