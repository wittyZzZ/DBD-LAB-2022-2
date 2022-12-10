package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto,Integer> {
}
