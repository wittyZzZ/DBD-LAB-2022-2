package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Region;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegionService {

    // Create
    public Region crearRegion(Region region);

    // Update
    public Region actualizarRegion(Region region);

    // Read
    public List<Region> getAllRegiones();

    // Read
    public Region getRegionById(Integer id_region);

    // Delete
    public Region eliminarRegion(Integer id_region) throws Exception;
}
