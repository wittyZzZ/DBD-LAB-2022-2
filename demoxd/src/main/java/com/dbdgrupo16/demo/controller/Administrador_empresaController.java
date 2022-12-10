package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Administrador_empresa;
import com.dbdgrupo16.demo.service.Administrador_empresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administradores_empresas")
public class Administrador_empresaController {
    @Autowired
    private Administrador_empresaService administrador_empresaService;

    @GetMapping
    public ResponseEntity<List<Administrador_empresa>> getAllAdministradores_empresas() {
        List<Administrador_empresa> admin_emp = null;
        try {
            admin_emp = administrador_empresaService.getAllAdministradores_empresas();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Administrador_empresa>>(admin_emp, HttpStatus.OK);
    }

    @GetMapping("{id_administrador_empresa}")
    public ResponseEntity<Administrador_empresa> getAdministrador_empresaById(@PathVariable("id_administrador_empresa") Integer id_administrador_empresa) {
        Administrador_empresa admin_emp = null;
        try {
            admin_emp = administrador_empresaService.getAdministrador_empresaById(id_administrador_empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Administrador_empresa>(admin_emp,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Administrador_empresa> crearAdministrador_empresa(@RequestBody Administrador_empresa administrador_empresa){
        Administrador_empresa admin_emp = null;
        try {
            admin_emp = administrador_empresaService.crearAdministrador_empresa(administrador_empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Administrador_empresa>(admin_emp,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Administrador_empresa> actualizarAdministrador_empresa(@RequestBody Administrador_empresa administrador_empresa){
        Administrador_empresa admin_emp = null;
        try {
            admin_emp = administrador_empresaService.actualizarAdministrador_empresa(administrador_empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Administrador_empresa>(admin_emp,HttpStatus.OK);
    }

    @DeleteMapping("{id_administrador_empresa}")
    public ResponseEntity<Administrador_empresa> eliminarAdministrador_empresa(@PathVariable("id_administrador_empresa") Integer id_administrador_empresa){
        Administrador_empresa admin_emp = null;
        try {
            admin_emp = administrador_empresaService.eliminarAdministrador_empresa(id_administrador_empresa);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Administrador_empresa>(admin_emp,HttpStatus.OK);
    }
}
