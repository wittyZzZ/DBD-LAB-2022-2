package com.dbdgrupo16.demo.controller;

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

    @GetMapping("/allRoles")
    public ResponseEntity<List<Rol>> getAllRoles() {
        List<Rol> roles = null;
        try {
            roles = rolService.getAllRoles();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Rol>>(roles,HttpStatus.OK);
    }

    @GetMapping("/getById/{id_rol}")
    public ResponseEntity<Rol> getRolById(@PathVariable("id_rol") Integer id_rol) {
        Rol roles = null;
        try {
            roles = rolService.getRolById(id_rol);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol>(roles,HttpStatus.OK);
    }

    @PostMapping("/crearoActualizar")
    public ResponseEntity<Rol> crearActualizarRol(@RequestBody Rol rol){
        Rol roles = null;
        try {
            roles = rolService.crearActualizarRol(rol);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol>(roles,HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id_region}")
    public ResponseEntity<Rol> eliminarRol(@PathVariable("id_rol") Integer id_rol){
        Rol roles = null;
        try {
            roles = rolService.eliminarRol(id_rol);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Rol>(roles,HttpStatus.OK);
    }
}
