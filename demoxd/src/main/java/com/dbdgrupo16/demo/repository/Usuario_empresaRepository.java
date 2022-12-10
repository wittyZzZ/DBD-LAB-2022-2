package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Usuario_empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario_empresaRepository extends JpaRepository<Usuario_empresa, Integer> {
}
