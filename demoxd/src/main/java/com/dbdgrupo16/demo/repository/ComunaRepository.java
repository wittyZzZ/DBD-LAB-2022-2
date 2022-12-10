package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Comuna;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunaRepository extends CrudRepository<Comuna,Integer>{
}
