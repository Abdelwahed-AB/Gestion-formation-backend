package com.example.gestionformation.controllers;

import com.example.gestionformation.entities.Formation;
import com.example.gestionformation.entities.Membre;
import com.example.gestionformation.services.IFormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/formations") @CrossOrigin("*")
@RequiredArgsConstructor
public class FormationController {
    private final IFormationService formationService;

    @GetMapping
    public List<Formation> getFormations(@RequestParam(defaultValue = "") String name){
        return formationService.getFormations(name);
    }

    @GetMapping("/{id}")
    public Formation getFormationById(@PathVariable("id") Long id){
        return formationService.getFormationById(id);
    }

    @PostMapping
    public void createFormation(@RequestBody Formation formation){
        formationService.createFormation(formation);
    }

    @PutMapping("/{id}")
    public void updateFormation(@PathVariable("id") Long id, @RequestBody Formation formation){
        formationService.updateFormation(id, formation);
    }

    @DeleteMapping("/{id}")
    public void deleteFormation(@PathVariable("id") Long id){
        formationService.deleteFormation(id);
    }
}
