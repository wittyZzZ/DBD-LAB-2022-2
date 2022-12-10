package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Carro_de_compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carro_de_compraRepository extends JpaRepository<Carro_de_compra,Integer> {
}
