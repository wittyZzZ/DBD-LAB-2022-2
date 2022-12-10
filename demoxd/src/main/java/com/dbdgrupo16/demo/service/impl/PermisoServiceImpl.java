package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Permiso;
import com.dbdgrupo16.demo.repository.PermisoRepository;
import com.dbdgrupo16.demo.service.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoServiceImpl implements PermisoService {

    @Autowired
    private PermisoRepository permisoRepository;

    // Create
    @Override
    public Permiso crearPermiso(Permiso permiso) {
        return permisoRepository.save(permiso);
    }

    // Update
    @Override
    public Permiso actualizarPermiso(Permiso permiso) {
        return permisoRepository.save(permiso);
    }

    // Read
    @Override
    public List<Permiso> getAllPermisos() {
        return (List<Permiso>) permisoRepository.findAll();
    }

    // Read
    @Override
    public Permiso getPermisoById(Integer id_permiso) {
        return permisoRepository.findById(id_permiso).orElse(null);
    }

    // Delete
    @Override
    public Permiso eliminarPermiso(Integer id_permiso) throws Exception {
        Permiso deletedPermiso = null;
        try {
            deletedPermiso = permisoRepository.findById(id_permiso).orElse(null);
            if(deletedPermiso == null) {
                throw new Exception("Permiso no disponible");
            }else {
                permisoRepository.deleteById(id_permiso);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedPermiso;
    }
}