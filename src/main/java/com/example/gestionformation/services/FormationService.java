package com.example.gestionformation.services;

import com.example.gestionformation.entities.Formation;
import com.example.gestionformation.entities.Membre;
import com.example.gestionformation.repositories.FormationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormationService implements IFormationService{
    private final FormationRepository formationRepository;

    @Override
    public Formation getFormationById(Long id) {
        return formationRepository.findById(id).orElseThrow(()-> new RuntimeException("Formation not found"));
    }

    @Override
    public List<Formation> getFormations(String nom) {
        List<Formation> formations = formationRepository.findAll();

        if(nom.isBlank()) {
            return formations;
        }else{
            return formations.stream().filter(formation -> formation.getTitre().toLowerCase().contains(nom.toLowerCase())).toList();
        }
    }

    @Override
    public void createFormation(Formation formation) {
        formation.setId(null);
        formationRepository.save(formation);
    }

    @Override
    public void updateFormation(Long id, Formation formation) {
        formation.setId(id);
        formationRepository.save(formation);
    }

    @Override
    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }
}
