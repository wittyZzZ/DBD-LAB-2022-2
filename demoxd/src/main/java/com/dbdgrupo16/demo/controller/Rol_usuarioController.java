package com.dbdgrupo16.demo.controller;


import com.dbdgrupo16.demo.models.Rol_usuario;
import com.dbdgrupo16.demo.models.Usuario;
import com.dbdgrupo16.demo.service.Rol_usuarioService;
import com.dbdgrupo16.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Roles_usuario")
public class Rol_usuarioController {
    @Autowired
    private Rol_usuarioService rol_usuarioService;

    @GetMapping
    public ResponseEntity<List<Rol_usuario>> getAllRoles_usuario() {
        List<Rol_usuario> rol = null;
        try {
            rol = rol_usuarioService.getAllRoles_usuario();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Rol_usuario>>(rol, HttpStatus.OK);
    }

    @GetMapping("{id_rol_usuario}")
    public ResponseEntity<Rol_usuario> getRol_usuarioById(@PathVariable("id_rol_usuario") Integer id_rol_usuario) {
        Rol_usuario rol = null;
        try {
            rol = rol_usuarioService.getRol_usuarioById(id_rol_usuario);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol_usuario>(rol,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Rol_usuario> crearRol_usuario(@RequestBody Rol_usuario rol_usuario){
        Rol_usuario rol = null;
        try {
            rol = rol_usuarioService.crearRol_usuario(rol_usuario);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol_usuario>(rol,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Rol_usuario> actualizarRol_usuario(@RequestBody Rol_usuario rol_usuario){
        Rol_usuario rol = null;
        try {
            rol = rol_usuarioService.actualizarRol_usuario(rol_usuario);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol_usuario>(rol,HttpStatus.OK);
    }

    @DeleteMapping("{id_rol_usuario}")
    public ResponseEntity<Rol_usuario> eliminarRol_usuario(@PathVariable("id_rol_usuario") Integer id_rol_usuario){
        Rol_usuario rol = null;
        try {
            rol = rol_usuarioService.eliminarRol_usuario(id_rol_usuario);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol_usuario>(rol,HttpStatus.OK);
    }
}
