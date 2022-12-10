package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Direccion;
import com.dbdgrupo16.demo.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direcciones")
public class DireccionController {
    @Autowired
    private DireccionService direccionService;

    @GetMapping
    public ResponseEntity<List<Direccion>> getAllDirecciones() {
        List<Direccion> direccion = null;
        try {
            direccion = direccionService.getAllDirecciones();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Direccion>>(direccion, HttpStatus.OK);
    }

    @GetMapping("{id_direccion}")
    public ResponseEntity<Direccion> getDireccionById(@PathVariable("id_direccion") Integer id_direccion) {
        Direccion direccion = null;
        try {
            direccion = direccionService.getDireccionById(id_direccion);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Direccion>(direccion,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Direccion> crearDireccion(@RequestBody Direccion direccion){
        Direccion direc = null;
        try {
            direc = direccionService.crearDireccion(direccion);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Direccion>(direc,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Direccion> actualizarDireccion(@RequestBody Direccion direccion){
        Direccion direc = null;
        try {
            direc = direccionService.actualizarDireccion(direccion);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Direccion>(direc,HttpStatus.OK);
    }

    @DeleteMapping("{id_direccion}")
    public ResponseEntity<Direccion> eliminarDireccion(@PathVariable("id_direccion") Integer id_direccion){
        Direccion direccion = null;
        try {
            direccion = direccionService.eliminarDireccion(id_direccion);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Direccion>(direccion,HttpStatus.OK);
    }
}
