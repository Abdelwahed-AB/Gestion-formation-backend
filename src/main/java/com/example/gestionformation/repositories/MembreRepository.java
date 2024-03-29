package com.example.gestionformation.repositories;

import com.example.gestionformation.entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreRepository extends JpaRepository<Membre, Long> {
}
