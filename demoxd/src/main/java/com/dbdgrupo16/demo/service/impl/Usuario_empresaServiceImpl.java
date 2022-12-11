package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Usuario_empresa;
import com.dbdgrupo16.demo.repository.Usuario_empresaRepository;
import com.dbdgrupo16.demo.service.Usuario_empresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Usuario_empresaServiceImpl implements Usuario_empresaService {


    @Autowired
    private Usuario_empresaRepository usuario_empresaRepository;

    @Override
    public Usuario_empresa crearUsuario_empresa(Usuario_empresa usuario_empresa) {
        return usuario_empresaRepository.save(usuario_empresa);
    }

    @Override
    public Usuario_empresa actualizarUsuario_empresa(Usuario_empresa usuario_empresa) {
        return usuario_empresaRepository.save(usuario_empresa);
    }

    @Override
    public List<Usuario_empresa> getAllUsuarios_empresa() {
        return (List<Usuario_empresa>) usuario_empresaRepository.findAll();
    }

    @Override
    public Usuario_empresa getUsuario_empresaById(Integer id_usuario_empresa) {
        return usuario_empresaRepository.findById(id_usuario_empresa).orElse(null);
    }

    @Override
    public Usuario_empresa eliminarUsuario_empresa(Integer id_usuario_empresa) throws Exception {
        Usuario_empresa deletedUsuario_empresa = null;
        try {
            deletedUsuario_empresa = usuario_empresaRepository.findById(id_usuario_empresa).orElse(null);
            if(deletedUsuario_empresa == null) {
                throw new Exception("Usuario_empresa no disponible");
            }else {
                usuario_empresaRepository.deleteById(id_usuario_empresa);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedUsuario_empresa;
    }
}
