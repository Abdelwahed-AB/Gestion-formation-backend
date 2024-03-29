package com.example.gestionformation.services;

import com.example.gestionformation.entities.Formation;
import com.example.gestionformation.entities.Membre;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InscriptionService implements IInscriptionService{
    private final IFormationService formationService;
    private final IMembreService membreService;

    @Override
    public void inscrireMembreDansFormation(Long membreId, Long formationId) {
        Formation formation = formationService.getFormationById(formationId);
        Membre membre = membreService.getMembreById(membreId);

        formation.getMembres().add(membre);

        formationService.updateFormation(formationId, formation);
    }

    @Override
    public void desinscrireMembreDeFormation(Long membreId, Long formationId) {
        Formation formation = formationService.getFormationById(formationId);
        Membre membre = membreService.getMembreById(membreId);

        formation.getMembres().remove(membre);

        formationService.updateFormation(formationId, formation);
    }
}
