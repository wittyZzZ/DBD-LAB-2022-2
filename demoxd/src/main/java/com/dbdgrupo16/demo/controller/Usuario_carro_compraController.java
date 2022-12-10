package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Usuario_carro_compra;
import com.dbdgrupo16.demo.service.Usuario_carro_compraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios_carro_compra")
public class Usuario_carro_compraController {
    @Autowired
    private Usuario_carro_compraService usuario_carro_compraService;

    @GetMapping
    public ResponseEntity<List<Usuario_carro_compra>> getAllUsuarios_carro_compra() {
        List<Usuario_carro_compra> user_carro_compra = null;
        try {
            user_carro_compra = usuario_carro_compraService.getAllUsuarios_carro_compra();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Usuario_carro_compra>>(user_carro_compra, HttpStatus.OK);
    }

    @GetMapping("{id_usuario_carro_compra}")
    public ResponseEntity<Usuario_carro_compra> getUsuario_carro_compraById(@PathVariable("id_usuario_carro_compra") Integer id_usuario_carro_compra) {
        Usuario_carro_compra user_carro_compra = null;
        try {
            user_carro_compra = usuario_carro_compraService.getUsuario_carro_compraById(id_usuario_carro_compra);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_carro_compra>(user_carro_compra,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario_carro_compra> crearUsuario_carro_compra(@RequestBody Usuario_carro_compra usuario_carro_compra){
        Usuario_carro_compra user_carro_compra = null;
        try {
            user_carro_compra = usuario_carro_compraService.crearUsuario_carro_compra(usuario_carro_compra);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_carro_compra>(user_carro_compra,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Usuario_carro_compra> actualizarUsuario_carro_compra(@RequestBody Usuario_carro_compra usuario_carro_compra){
        Usuario_carro_compra user_carro_compra = null;
        try {
            user_carro_compra = usuario_carro_compraService.actualizarUsuario_carro_compra(usuario_carro_compra);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_carro_compra>(user_carro_compra,HttpStatus.OK);
    }

    @DeleteMapping("{id_usuario_carro_compra}")
    public ResponseEntity<Usuario_carro_compra> eliminarUsuario_carro_compra(@PathVariable("id_usuario_carro_compra") Integer id_usuario_carro_compra){
        Usuario_carro_compra user_carro_compra = null;
        try {
            user_carro_compra = usuario_carro_compraService.eliminarUsuario_carro_compra(id_usuario_carro_compra);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_carro_compra>(user_carro_compra,HttpStatus.OK);
    }
}
