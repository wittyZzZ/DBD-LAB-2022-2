package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Region;
import com.dbdgrupo16.demo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regiones")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/allRegiones")
    public ResponseEntity<List<Region>> getAllRegiones() {
        List<Region> regiones = null;
        try {
            regiones = regionService.getAllRegiones();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Region>>(regiones,HttpStatus.OK);
    }

    @GetMapping("/getById/{id_region}")
    public ResponseEntity<Region> getRegionById(@PathVariable("id_region") Integer id_region) {
        Region regiones = null;
        try {
            regiones = regionService.getRegionById(id_region);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Region>(regiones,HttpStatus.OK);
    }

    @PostMapping("/crearoActualizar")
    public ResponseEntity<Region> crearActualizarRegion(@RequestBody Region region){
        Region regiones = null;
        try {
            regiones = regionService.crearActualizarRegion(region);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Region>(regiones,HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id_region}")
    public ResponseEntity<Region> eliminarRegion(@PathVariable("id_region") Integer id_region){
        Region regiones = null;
        try {
            regiones = regionService.eliminarRegion(id_region);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Region>(regiones,HttpStatus.OK);
    }
}
