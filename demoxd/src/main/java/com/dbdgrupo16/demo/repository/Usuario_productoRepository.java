package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Usuario_producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario_productoRepository extends JpaRepository<Usuario_producto,Integer> {
}
