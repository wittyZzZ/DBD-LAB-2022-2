package com.dbdgrupo16.demo.controller;

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

    @GetMapping("/allUsuarios")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuarios = null;
        try {
            usuarios = usuarioService.getAllUsuarios();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
    }

    @GetMapping("/getById/{id_usuario}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id_usuario") Integer id_region) {
        Usuario usuarios = null;
        try {
            usuarios = usuarioService.getUsuarioById(id_region);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario>(usuarios,HttpStatus.OK);
    }

    @PostMapping("/crearoActualizar")
    public ResponseEntity<Usuario> crearActualizarRegion(@RequestBody Usuario usuario){
        Usuario usuarios = null;
        try {
            usuarios = usuarioService.crearActualizarUsuario(usuario);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario>(usuarios,HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id_usuario}")
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable("id_usuario") Integer id_usuario){
        Usuario usuarios = null;
        try {
            usuarios = usuarioService.eliminarUsuario(id_usuario);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario>(usuarios,HttpStatus.OK);
    }
}
