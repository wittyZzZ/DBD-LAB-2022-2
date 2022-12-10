package com.dbdgrupo16.demo.service.impl;


import com.dbdgrupo16.demo.models.Rol_permiso;
import com.dbdgrupo16.demo.repository.Rol_permisoRepository;
import com.dbdgrupo16.demo.service.Rol_permisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Rol_permisoServiceImpl implements Rol_permisoService {

    @Autowired
    private Rol_permisoRepository rol_permisoRepository;

    @Override
    public Rol_permiso crearRol_permiso(Rol_permiso rol_permiso){
        return rol_permisoRepository.save(rol_permiso);
    }

    @Override
    public Rol_permiso actualizarRol_permiso(Rol_permiso rol_permiso){
        return rol_permisoRepository.save(rol_permiso);
    }

    @Override
    public List<Rol_permiso> getAllRoles_permiso(){
        return (List<Rol_permiso>) rol_permisoRepository.findAll();
    }
    @Override
    public Rol_permiso getRol_permisoById(Integer id_rol_permiso){
        return rol_permisoRepository.findById(id_rol_permiso).orElse(null);
    }

    @Override
    public  Rol_permiso eliminarRol_permiso(Integer id_rol_permiso) throws  Exception{
        Rol_permiso deletedRol_permiso = null;
        try{
            deletedRol_permiso = rol_permisoRepository.findById(id_rol_permiso).orElse(null);
            if (deletedRol_permiso == null){
                throw new Exception("Rol_permiso no disponible");
            }else {
                rol_permisoRepository.deleteById(id_rol_permiso);
            }
        }catch (Exception ex){
            throw ex;
        }
        return deletedRol_permiso;
    }
}
