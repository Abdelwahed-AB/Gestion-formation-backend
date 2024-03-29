package com.example.gestionformation.services;

import com.example.gestionformation.entities.Membre;

public interface IInscriptionService {
    void inscrireMembreDansFormation(Long membreId, Long formationId);
    void desinscrireMembreDeFormation(Long membreId, Long formationId);
}
