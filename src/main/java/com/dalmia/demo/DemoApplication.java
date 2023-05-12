package com.dalmia.demo;

import com.dalmia.demo.entities.TargetPlant;
//import com.dalmia.demo.repo.TargetPlantRepo;
import com.dalmia.demo.repo.TargetPlantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private TargetPlantRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        TargetPlant plant = new TargetPlant();
////        plant.setId(1);
//        plant.setActive(true);
//        plant.setName("xyz");
//        plant.setApprovedBy("mee");
//
//        repo.save(plant);
//
//        System.out.println(repo.getClass().getName());

    }
}
