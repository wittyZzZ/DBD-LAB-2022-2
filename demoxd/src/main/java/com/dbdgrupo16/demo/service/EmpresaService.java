package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpresaService {

        // Create
        public Empresa crearEmpresa(Empresa empresa);

        // Update
        public Empresa actualizarEmpresa(Empresa empresa);

        // Read
        public List<Empresa> getAllEmpresas();

        // Read
        public Empresa getEmpresaById(Integer id_empresa);

        // Delete
        public Empresa eliminarEmpresa(Integer id_empresa) throws Exception;
}
