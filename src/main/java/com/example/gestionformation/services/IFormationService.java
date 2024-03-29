package com.example.gestionformation.services;

import com.example.gestionformation.entities.Formation;
import com.example.gestionformation.entities.Membre;

import java.util.List;

public interface IFormationService {
    Formation getFormationById(Long id);
    List<Formation> getFormations(String nom);
    void createFormation(Formation formation);
    void updateFormation(Long id, Formation formation);
    void deleteFormation(Long id);
}

