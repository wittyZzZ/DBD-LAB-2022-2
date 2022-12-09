package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository<Region,Integer> {
}