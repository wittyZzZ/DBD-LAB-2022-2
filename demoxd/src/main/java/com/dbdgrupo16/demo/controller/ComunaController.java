package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Comuna;
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

    @GetMapping("/allComunas")
    public ResponseEntity<List<Comuna>> getAllComunas() {
        List<Comuna> comunas = null;
        try {
            comunas = comunaService.getAllComunas();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Comuna>>(comunas,HttpStatus.OK);
    }
    @GetMapping("/getById/{id_comuna}")
    public ResponseEntity<Comuna> getComunaById(@PathVariable("id_comuna") Integer id_comuna) {
        Comuna comunas = null;
        try {
            comunas = comunaService.getComunaById(id_comuna);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Comuna>(comunas,HttpStatus.OK);
    }
    @PostMapping("/crearoActualizar")
    public ResponseEntity<Comuna> crearActualizarComuna(@RequestBody Comuna comuna){
        Comuna comunas = null;
        try {
            comunas = comunaService.crearActualizarComuna(comuna);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Comuna>(comunas,HttpStatus.OK);
}
    @DeleteMapping("/eliminar/{id_comuna}")
    public ResponseEntity<Comuna> eliminarComuna(@PathVariable("id_comuna") Integer id_comuna) {
        Comuna comunas = null;
        try {
            comunas = comunaService.eliminarComuna(id_comuna);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Comuna>(comunas, HttpStatus.OK);
    }
}