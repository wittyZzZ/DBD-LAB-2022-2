package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Usuario_carro_compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario_carro_compraRepository extends JpaRepository<Usuario_carro_compra,Integer> {
}
