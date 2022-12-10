package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Region;
import com.dbdgrupo16.demo.repository.RegionRepository;
import com.dbdgrupo16.demo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    // Create
    @Override
    public Region crearRegion(Region region) {
        return regionRepository.save(region);
    }

    // Update
    @Override
    public Region actualizarRegion(Region region) {
        return regionRepository.save(region);
    }

    // Read
    @Override
    public List<Region> getAllRegiones() {
        return (List<Region>) regionRepository.findAll();
    }

    // Read
    @Override
    public Region getRegionById(Integer id_region) {
        return regionRepository.findById(id_region).orElse(null);
    }

    // Delete
    @Override
    public Region eliminarRegion(Integer id_region) throws Exception {
        Region deletedRegion = null;
        try {
            deletedRegion = regionRepository.findById(id_region).orElse(null);
            if(deletedRegion == null) {
                throw new Exception("Region no disponible");
            }else {
                regionRepository.deleteById(id_region);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedRegion;
    }
}