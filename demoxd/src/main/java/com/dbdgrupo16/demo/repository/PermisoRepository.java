package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso,Integer> {
}

