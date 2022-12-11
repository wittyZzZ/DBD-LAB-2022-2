package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Permiso;
import com.dbdgrupo16.demo.service.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permiso")
public class PermisoController {

    @Autowired
    private PermisoService permisoService;

    @GetMapping
    public ResponseEntity<List<Permiso>> getAllPermisos() {
        List<Permiso> permi = null;
        try {
            permi = permisoService.getAllPermisos();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Permiso>>(permi, HttpStatus.OK);
    }

    @GetMapping("{id_permiso}")
    public ResponseEntity<Permiso> getPermisoById(@PathVariable("id_permiso") Integer id_permiso) {
        Permiso permi = null;
        try {
            permi = permisoService.getPermisoById(id_permiso);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Permiso>(permi,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Permiso> crearPermiso(@RequestBody Permiso permiso){
        Permiso permi = null;
        try {
            permi = permisoService.crearPermiso(permiso);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Permiso>(permi,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Permiso> actualizarPermiso(@RequestBody Permiso permiso){
        Permiso permi = null;
        try {
            permi = permisoService.actualizarPermiso(permiso);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Permiso>(permi,HttpStatus.OK);
    }

    @DeleteMapping("{id_permiso}")
    public ResponseEntity<Permiso> eliminarPermiso(@PathVariable("id_permiso") Integer id_permiso){
        Permiso permi = null;
        try {
            permi = permisoService.eliminarPermiso(id_permiso);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Permiso>(permi,HttpStatus.OK);
    }
}