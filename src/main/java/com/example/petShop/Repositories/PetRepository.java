package com.example.petShop.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petShop.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
