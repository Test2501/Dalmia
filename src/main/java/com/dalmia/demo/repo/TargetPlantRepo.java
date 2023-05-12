package com.dalmia.demo.repo;

import com.dalmia.demo.entities.TargetPlant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface TargetPlantRepo extends JpaRepository<TargetPlant, Integer> {

}
