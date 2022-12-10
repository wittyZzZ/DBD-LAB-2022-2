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

    @GetMapping
    public ResponseEntity<List<Region>> getAllRegiones() {
        List<Region> regi = null;
        try {
            regi = regionService.getAllRegiones();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Region>>(regi,HttpStatus.OK);
    }

    @GetMapping("{id_region}")
    public ResponseEntity<Region> getRegionById(@PathVariable("id_region") Integer id_region) {
        Region regi = null;
        try {
            regi = regionService.getRegionById(id_region);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Region>(regi,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Region> crearRegion(@RequestBody Region region){
        Region regi = null;
        try {
            regi = regionService.crearRegion(region);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Region>(regi,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Region> actualizarRegion(@RequestBody Region region){
        Region regi = null;
        try {
            regi = regionService.actualizarRegion(region);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Region>(regi,HttpStatus.OK);
    }

    @DeleteMapping("{id_region}")
    public ResponseEntity<Region> eliminarRegion(@PathVariable("id_region") Integer id_region){
        Region regi = null;
        try {
            regi = regionService.eliminarRegion(id_region);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Region>(regi,HttpStatus.OK);
    }
}
