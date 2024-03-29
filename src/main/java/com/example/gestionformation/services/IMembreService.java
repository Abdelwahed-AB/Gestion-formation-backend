package com.example.gestionformation.services;

import com.example.gestionformation.entities.Membre;

import java.util.List;

public interface IMembreService {
    List<Membre> getMembres(Long formationId);
    Membre getMembreById(Long id);
    void createMembre(Membre membre);
    void updateMembre(Long id, Membre membre);
    void deleteMembre(Long id);
}
