package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Administrador_empresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Administrador_empresaService {
    // Create
    public Administrador_empresa crearAdministrador_empresa(Administrador_empresa administrador_empresa);

    // Update
    public Administrador_empresa actualizarAdministrador_empresa(Administrador_empresa administrador_empresa);

    // Read
    public List<Administrador_empresa> getAllAdministradores_empresas();

    // Read
    public Administrador_empresa getAdministrador_empresaById(Integer id_administrador_empresa);

    // Delete
    public Administrador_empresa eliminarAdministrador_empresa(Integer id_administrador_empresa) throws Exception;
}
