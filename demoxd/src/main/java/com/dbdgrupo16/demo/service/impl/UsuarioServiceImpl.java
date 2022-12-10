package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Usuario;
import com.dbdgrupo16.demo.repository.UsuarioRepository;
import com.dbdgrupo16.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuarioById(Integer id_usuario) {
        return usuarioRepository.findById(id_usuario).orElse(null);
    }

    @Override
    public Usuario eliminarUsuario(Integer id_usuario) throws Exception {
        Usuario deletedUsuario = null;
        try {
            deletedUsuario = usuarioRepository.findById(id_usuario).orElse(null);
            if(deletedUsuario == null) {
                throw new Exception("Usuario no disponible");
            }else {
                usuarioRepository.deleteById(id_usuario);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedUsuario;
    }
}
