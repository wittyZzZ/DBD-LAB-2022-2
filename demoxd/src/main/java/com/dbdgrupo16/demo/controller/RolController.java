package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Region;
import com.dbdgrupo16.demo.models.Rol;
import com.dbdgrupo16.demo.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public ResponseEntity<List<Rol>> getAllRoles() {
        List<Rol> roli = null;
        try {
            roli = rolService.getAllRoles();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Rol>>(roli,HttpStatus.OK);
    }

    @GetMapping("{id_rol}")
    public ResponseEntity<Rol> getRolById(@PathVariable("id_rol") Integer id_rol) {
        Rol roli = null;
        try {
            roli = rolService.getRolById(id_rol);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol>(roli,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Rol> crearRol(@RequestBody Rol rol){
        Rol roli = null;
        try {
            roli = rolService.crearRol(rol);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol>(roli,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Rol> actualizarRol(@RequestBody Rol rol){
        Rol roli = null;
        try {
            roli = rolService.actualizarRol(rol);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol>(roli,HttpStatus.OK);
    }

    @DeleteMapping("{id_region}")
    public ResponseEntity<Rol> eliminarRol(@PathVariable("id_rol") Integer id_rol){
        Rol roli = null;
        try {
            roli = rolService.eliminarRol(id_rol);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol>(roli,HttpStatus.OK);
    }
}
