package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Comuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunaRepository extends JpaRepository<Comuna,Integer> {
}
