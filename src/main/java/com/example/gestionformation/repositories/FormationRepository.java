package com.example.gestionformation.repositories;

import com.example.gestionformation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}
