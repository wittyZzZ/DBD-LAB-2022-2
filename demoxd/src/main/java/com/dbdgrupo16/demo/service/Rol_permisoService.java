package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Rol_permiso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Rol_permisoService {
    //Create
    public Rol_permiso crearRol_permiso(Rol_permiso rol_permiso);

    //Update
    public Rol_permiso actualizarRol_permiso(Rol_permiso rol_permiso);

    //Read
    public List<Rol_permiso> getAllRoles_permiso();
    //Read
    public Rol_permiso getRol_permisoById(Integer id_rol_permiso);

    //Deleted
    public  Rol_permiso eliminarRol_permiso(Integer id_rol_permiso) throws  Exception;

}
