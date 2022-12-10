package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Rol_usuario;
import com.dbdgrupo16.demo.models.Usuario;
import com.dbdgrupo16.demo.repository.Rol_usuarioRepository;
import com.dbdgrupo16.demo.repository.UsuarioRepository;
import com.dbdgrupo16.demo.service.Rol_usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Rol_usuarioServiceImpl implements Rol_usuarioService {

    @Autowired
    private Rol_usuarioRepository rol_usuarioRepository;

    @Override
    public Rol_usuario crearRol_usuario(Rol_usuario rol_usuario) {
        return rol_usuarioRepository.save(rol_usuario);
    }

    @Override
    public Rol_usuario actualizarRol_usuario(Rol_usuario rol_usuario) {
        return rol_usuarioRepository.save(rol_usuario);
    }

    @Override
    public List<Rol_usuario> getAllRoles_usuario() {
        return (List<Rol_usuario>) rol_usuarioRepository.findAll();
    }

    @Override
    public Rol_usuario getRol_usuarioById(Integer id_rol_usuario) {
        return rol_usuarioRepository.findById(id_rol_usuario).orElse(null);
    }

    @Override
    public Rol_usuario eliminarRol_usuario(Integer id_rol_usuario) throws Exception {
        Rol_usuario deletedRol_usuario = null;
        try {
            deletedRol_usuario = rol_usuarioRepository.findById(id_rol_usuario).orElse(null);
            if(deletedRol_usuario == null) {
                throw new Exception("Rol_usuario no disponible");
            }else {
                rol_usuarioRepository.deleteById(id_rol_usuario);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedRol_usuario;
    }
}
