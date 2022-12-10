package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Rol_usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rol_usuarioRepository extends JpaRepository<Rol_usuario, Integer> {
}
