package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Usuario_empresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Usuario_empresaService {

    // Create a
    public Usuario_empresa crearUsuario_empresa(Usuario_empresa usuario_empresa);

    // Update
    public Usuario_empresa actualizarUsuario_empresa(Usuario_empresa usuario_empresa);

    // Read
    public List<Usuario_empresa> getAllUsuarios_empresa();

    // Read
    public Usuario_empresa getUsuario_empresaById(Integer id_usuario_empresa);

    // Delete
    public Usuario_empresa eliminarUsuario_empresa(Integer id_usuario_empresa) throws Exception;

}
