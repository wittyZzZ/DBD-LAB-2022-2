package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Region;
import com.dbdgrupo16.demo.models.Usuario;
import com.dbdgrupo16.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> user = null;
        try {
            user = usuarioService.getAllUsuarios();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Usuario>>(user,HttpStatus.OK);
    }

    @GetMapping("{id_usuario}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id_usuario") Integer id_usuario) {
        Usuario user = null;
        try {
            user = usuarioService.getUsuarioById(id_usuario);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario>(user,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        Usuario user = null;
        try {
            user = usuarioService.crearUsuario(usuario);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario>(user,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario usuario){
        Usuario user = null;
        try {
            user = usuarioService.actualizarUsuario(usuario);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario>(user,HttpStatus.OK);
    }

    @DeleteMapping("{id_usuario}")
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable("id_usuario") Integer id_usuario){
        Usuario user = null;
        try {
            user = usuarioService.eliminarUsuario(id_usuario);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario>(user,HttpStatus.OK);
    }
}
