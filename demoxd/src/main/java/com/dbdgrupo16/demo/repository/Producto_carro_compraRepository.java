package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Producto_carro_compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Producto_carro_compraRepository extends JpaRepository<Producto_carro_compra, Integer> {
}
