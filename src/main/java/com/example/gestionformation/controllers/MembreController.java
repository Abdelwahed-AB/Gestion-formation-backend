package com.example.gestionformation.controllers;

import com.example.gestionformation.entities.Membre;
import com.example.gestionformation.services.IMembreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/membres") @CrossOrigin("*")
@RequiredArgsConstructor
public class MembreController {
    private final IMembreService membreService;

    @GetMapping
    public List<Membre> getAllMembres(@RequestParam(required = false, name = "formation") Long formationId){
        return membreService.getMembres(formationId);
    }

    @GetMapping("/{id}")
    public Membre getMembreById(@PathVariable("id") Long id){
        return membreService.getMembreById(id);
    }

    @PostMapping
    public void createMembre(@RequestBody Membre membre){
        membreService.createMembre(membre);
    }

    @PutMapping("/{id}")
    public void updateMembre(@PathVariable Long id, @RequestBody Membre membre){
        membreService.updateMembre(id, membre);
    }

    @DeleteMapping("/{id}")
    public void deleteMembre(@PathVariable Long id){
        membreService.deleteMembre(id);
    }
}
