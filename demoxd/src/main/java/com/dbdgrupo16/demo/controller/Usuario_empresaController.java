package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Usuario_empresa;
import com.dbdgrupo16.demo.service.Usuario_empresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuario_empresa")
public class Usuario_empresaController {
    @Autowired
    private Usuario_empresaService usuario_empresaService;

    @GetMapping
    public ResponseEntity<List<Usuario_empresa>> getAllUsuarios_empresa() {
        List<Usuario_empresa> user_empresa = null;
        try {
            user_empresa = usuario_empresaService.getAllUsuarios_empresa();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Usuario_empresa>>(user_empresa, HttpStatus.OK);
    }

    @GetMapping("{id_usuario_empresa}")
    public ResponseEntity<Usuario_empresa> getUsuario_empresaById(@PathVariable("id_usuario_empresa") Integer id_usuario_empresa) {
        Usuario_empresa user_empresa = null;
        try {
            user_empresa = usuario_empresaService.getUsuario_empresaById(id_usuario_empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_empresa>(user_empresa,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario_empresa> crearUsuario_empresa(@RequestBody Usuario_empresa usuario_empresa){
        Usuario_empresa user_empresa = null;
        try {
            user_empresa = usuario_empresaService.crearUsuario_empresa(usuario_empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_empresa>(user_empresa,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Usuario_empresa> actualizarUsuario_empresa(@RequestBody Usuario_empresa usuario_empresa){
        Usuario_empresa user_empresa = null;
        try {
            user_empresa = usuario_empresaService.actualizarUsuario_empresa(usuario_empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_empresa>(user_empresa,HttpStatus.OK);
    }

    @DeleteMapping("{id_usuario_empresa}")
    public ResponseEntity<Usuario_empresa> eliminarUsuario_empresa(@PathVariable("id_usuario_empresa") Integer id_usuario_empresa){
        Usuario_empresa user_empresa = null;
        try {
            user_empresa = usuario_empresaService.eliminarUsuario_empresa(id_usuario_empresa);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_empresa>(user_empresa,HttpStatus.OK);
    }
}
