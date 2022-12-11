package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Usuario_producto;
import com.dbdgrupo16.demo.service.Usuario_productoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuario_producto")
public class Usuario_productoController {
    @Autowired
    private Usuario_productoService usuario_productoService;

    @GetMapping
    public ResponseEntity<List<Usuario_producto>> getAllUsuarios_producto() {
        List<Usuario_producto> user_producto = null;
        try {
            user_producto = usuario_productoService.getAllUsuarios_producto();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Usuario_producto>>(user_producto, HttpStatus.OK);
    }

    @GetMapping("{id_usuario_producto}")
    public ResponseEntity<Usuario_producto> getUsuario_productoById(@PathVariable("id_usuario_producto") Integer id_usuario_producto) {
        Usuario_producto user_producto = null;
        try {
            user_producto = usuario_productoService.getUsuario_productoById(id_usuario_producto);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_producto>(user_producto,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario_producto> crearUsuario_producto(@RequestBody Usuario_producto usuario_producto){
        Usuario_producto user_producto = null;
        try {
            user_producto = usuario_productoService.crearUsuario_producto(usuario_producto);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_producto>(user_producto,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Usuario_producto> actualizarUsuario_producto(@RequestBody Usuario_producto usuario_producto){
        Usuario_producto user_producto = null;
        try {
            user_producto = usuario_productoService.actualizarUsuario_producto(usuario_producto);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_producto>(user_producto,HttpStatus.OK);
    }

    @DeleteMapping("{id_usuario_producto}")
    public ResponseEntity<Usuario_producto> eliminarUsuario_producto(@PathVariable("id_usuario_producto") Integer id_usuario_producto){
        Usuario_producto user_producto = null;
        try {
            user_producto = usuario_productoService.eliminarUsuario_producto(id_usuario_producto);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Usuario_producto>(user_producto,HttpStatus.OK);
    }
}
