package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {
}