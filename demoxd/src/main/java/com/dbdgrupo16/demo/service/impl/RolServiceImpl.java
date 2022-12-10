package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.service.RolService;
import com.dbdgrupo16.demo.repository.RolRepository;
import com.dbdgrupo16.demo.models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Rol crearActualizarRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public List<Rol> getAllRoles() {
        return (List<Rol>) rolRepository.findAll();
    }

    @Override
    public Rol getRolById(Integer id_rol) {
        return rolRepository.findById(id_rol).orElse(null);
    }

    @Override
    public Rol eliminarRol(Integer id_rol) throws Exception {
        Rol deletedRol = null;
        try {
            deletedRol = rolRepository.findById(id_rol).orElse(null);
            if(deletedRol == null) {
                throw new Exception("Rol no disponible");
            }else {
                rolRepository.deleteById(id_rol);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedRol;
    }
}
