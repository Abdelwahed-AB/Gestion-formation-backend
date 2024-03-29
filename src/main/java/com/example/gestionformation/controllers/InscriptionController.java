package com.example.gestionformation.controllers;

import com.example.gestionformation.dto.InscriptionDto;
import com.example.gestionformation.services.IInscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/inscription") @CrossOrigin("*")
@RequiredArgsConstructor
public class InscriptionController {
    private final IInscriptionService inscriptionService;

    @PostMapping
    public void inscrireMembreDansFormation(@RequestBody InscriptionDto inscriptionDto){
        inscriptionService.inscrireMembreDansFormation(inscriptionDto.membreId(), inscriptionDto.formationId());
    }

    @DeleteMapping
    public void desinscrireMembreDeFormation(@RequestBody InscriptionDto inscriptionDto){
        inscriptionService.desinscrireMembreDeFormation(inscriptionDto.membreId(), inscriptionDto.formationId());
    }
}
