package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Rol_permiso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rol_permisoRepository extends JpaRepository<Rol_permiso,Integer> {
}
