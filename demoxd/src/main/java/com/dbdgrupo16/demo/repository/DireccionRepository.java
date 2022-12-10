package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion,Integer> {
}
