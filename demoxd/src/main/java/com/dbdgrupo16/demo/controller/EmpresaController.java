package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Empresa;
import com.dbdgrupo16.demo.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public ResponseEntity<List<Empresa>> getAllEmpresas() {
        List<Empresa> emp = null;
        try {
            emp = empresaService.getAllEmpresas();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Empresa>>(emp, HttpStatus.OK);
    }

    @GetMapping("{id_empresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("id_empresa") Integer id_empresa) {
        Empresa emp = null;
        try {
            emp = empresaService.getEmpresaById(id_empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Empresa>(emp,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Empresa> crearEmpresa(@RequestBody Empresa empresa){
        Empresa emp = null;
        try {
            emp = empresaService.crearEmpresa(empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Empresa>(emp,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Empresa> actualizarEmpresa(@RequestBody Empresa empresa){
        Empresa emp = null;
        try {
            emp = empresaService.actualizarEmpresa(empresa);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Empresa>(emp,HttpStatus.OK);
    }

    @DeleteMapping("{id_empresa}")
    public ResponseEntity<Empresa> eliminarEmpresa(@PathVariable("id_empresa") Integer id_empresa){
        Empresa emp = null;
        try {
            emp = empresaService.eliminarEmpresa(id_empresa);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Empresa>(emp,HttpStatus.OK);
    }
}
