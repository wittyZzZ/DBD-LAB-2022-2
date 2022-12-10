package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region,Integer> {
}
