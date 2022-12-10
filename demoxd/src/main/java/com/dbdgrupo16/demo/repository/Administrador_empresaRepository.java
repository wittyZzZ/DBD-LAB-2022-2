package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Administrador_empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Administrador_empresaRepository extends JpaRepository<Administrador_empresa,Integer> {
}
