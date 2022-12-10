package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Comuna;
import com.dbdgrupo16.demo.models.Region;
import com.dbdgrupo16.demo.service.ComunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/comunas")
public class ComunaController {
    @Autowired
    private ComunaService comunaService;

    @GetMapping
    public ResponseEntity<List<Comuna>> getAllComunas() {
        List<Comuna> comu = null;
        try {
            comu = comunaService.getAllComunas();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Comuna>>(comu,HttpStatus.OK);
    }
    @GetMapping("{id_comuna}")
    public ResponseEntity<Comuna> getComunaById(@PathVariable("id_comuna") Integer id_comuna) {
        Comuna comu = null;
        try {
            comu = comunaService.getComunaById(id_comuna);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Comuna>(comu,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Comuna> crearComuna(@RequestBody Comuna comuna){
        Comuna comu = null;
        try {
            comu = comunaService.crearComuna(comuna);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Comuna>(comu, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Comuna> actualizarComuna(@RequestBody Comuna comuna){
        Comuna comu = null;
        try {
            comu = comunaService.actualizarComuna(comuna);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Comuna>(comu,HttpStatus.OK);
    }

    @DeleteMapping("{id_comuna}")
    public ResponseEntity<Comuna> eliminarComuna(@PathVariable("id_comuna") Integer id_comuna) {
        Comuna comu = null;
        try {
            comu = comunaService.eliminarComuna(id_comuna);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Comuna>(comu, HttpStatus.OK);
    }
}