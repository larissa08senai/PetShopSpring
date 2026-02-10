package com.example.petShop.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petShop.entities.Chip;

public interface ChipRepository extends JpaRepository<Chip, Long>{

}
