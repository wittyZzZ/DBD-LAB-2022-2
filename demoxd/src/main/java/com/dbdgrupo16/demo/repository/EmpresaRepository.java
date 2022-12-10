package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
}
