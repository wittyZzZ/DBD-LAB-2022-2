package com.dbdgrupo16.demo.controller;


import com.dbdgrupo16.demo.models.Carro_de_compra;
import com.dbdgrupo16.demo.service.Carro_de_compraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro_de_compra")
public class Carro_de_compraController {
    @Autowired
    private Carro_de_compraService carro_de_compraService;

    @GetMapping
    public ResponseEntity<List<Carro_de_compra>> getAllCarro_de_compra() {
        List<Carro_de_compra> carro = null;
        try {
            carro = carro_de_compraService.getAllCarro_de_compra();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Carro_de_compra>>(carro, HttpStatus.OK);
    }

    @GetMapping({"id_carro_de_compra"})
    public ResponseEntity<Carro_de_compra>getCarro_de_compraById(@PathVariable("id_carro_de_compra")Integer id_carro){
        Carro_de_compra carro = null;
        try{
            carro = carro_de_compraService.getCarro_de_compraById(id_carro);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Carro_de_compra>(carro,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Carro_de_compra> crearCarro_de_compra(@RequestBody Carro_de_compra carro_de_compra){

        Carro_de_compra carro = null;
        try{
            carro = carro_de_compraService.crearCarro_de_compra(carro_de_compra);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Carro_de_compra>(carro,HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<Carro_de_compra>actualizarCarro_de_compra(@RequestBody Carro_de_compra carro_de_compra){

        Carro_de_compra carro = null;
        try{
            carro = carro_de_compraService.actualizarCarro_de_compra(carro_de_compra);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Carro_de_compra>(carro,HttpStatus.OK);
    }

    @DeleteMapping("{id_carro_de_compra}")
    public ResponseEntity<Carro_de_compra> eliminarCarro_de_compra(@PathVariable("id_carro") Integer id_carro) {

        Carro_de_compra carro = null;
        try {
            carro = carro_de_compraService.eliminarCarro_de_compra(id_carro);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Carro_de_compra>(carro, HttpStatus.OK);
    }

}
