package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Region;
import java.util.List;

public interface RegionService {

    // Create/Update
    public Region crearActualizarRegion(Region region);

    // Read
    public List<Region> getAllRegiones();

    // Read
    public Region getRegionById(Integer id_region);

    // Delete
    public Region eliminarRegion(Integer id_region) throws Exception;
}
