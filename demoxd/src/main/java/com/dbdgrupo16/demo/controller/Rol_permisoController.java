package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Rol_permiso;
import com.dbdgrupo16.demo.service.Rol_permisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Roles_permiso")
public class Rol_permisoController {

    @Autowired
    private Rol_permisoService rol_permisoService;

    @GetMapping
    public ResponseEntity<List<Rol_permiso>> getAllRoles_permiso(){
        List<Rol_permiso> rol_p = null;
        try {
            rol_p = rol_permisoService.getAllRoles_permiso();
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<List<Rol_permiso>>(rol_p, HttpStatus.OK);
    }

    @GetMapping("{id_rol_permiso}")
    public ResponseEntity<Rol_permiso> getRol_permisoById(@PathVariable("id_rol_permiso")Integer id_rol_permiso){
        Rol_permiso rol_p = null;
        try {
            rol_p = rol_permisoService.getRol_permisoById(id_rol_permiso);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Rol_permiso>(rol_p, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Rol_permiso> crearRol_permiso(@RequestBody Rol_permiso rol_permiso){
        Rol_permiso rol_p = null;
        try {
            rol_p = rol_permisoService.crearRol_permiso(rol_permiso);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Rol_permiso>(rol_p, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Rol_permiso> actualizarRol_permiso(@RequestBody Rol_permiso rol_permiso){
        Rol_permiso rol_p = null;
        try {
            rol_p = rol_permisoService.actualizarRol_permiso(rol_permiso);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Rol_permiso>(rol_p, HttpStatus.OK);
    }

    @DeleteMapping("{id_rol_permiso}")
    public ResponseEntity<Rol_permiso> eliminarRol_permiso(@PathVariable("id_rol_permiso")Integer id_rol_permiso){
        Rol_permiso rol_p = null;
        try {
            rol_p = rol_permisoService.eliminarRol_permiso(id_rol_permiso);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Rol_permiso>(rol_p, HttpStatus.OK);
    }


}
