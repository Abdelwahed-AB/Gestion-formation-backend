package com.example.gestionformation.services;

import com.example.gestionformation.entities.Membre;
import com.example.gestionformation.repositories.FormationRepository;
import com.example.gestionformation.repositories.MembreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembreService implements IMembreService{
    private final MembreRepository membreRepository;
    private final IFormationService formationService;

    @Override
    public List<Membre> getMembres(Long formationId) {
        if(formationId == null){
            return membreRepository.findAll();
        }

        return formationService.getFormationById(formationId).getMembres().stream().toList();
    }

    @Override
    public Membre getMembreById(Long id) {
        return membreRepository.findById(id).orElseThrow(()-> new RuntimeException("Membre not found"));
    }

    @Override
    public void createMembre(Membre membre) {
        membre.setId(null);
        membreRepository.save(membre);
    }

    @Override
    public void updateMembre(Long id, Membre membre) {
        membre.setId(id);
        membreRepository.save(membre);
    }

    @Override
    public void deleteMembre(Long id) {
        membreRepository.deleteById(id);
    }
}
