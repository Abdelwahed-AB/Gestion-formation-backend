package com.example.gestionformation;

import com.example.gestionformation.entities.Formation;
import com.example.gestionformation.entities.Membre;
import com.example.gestionformation.repositories.FormationRepository;
import com.example.gestionformation.repositories.MembreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
@RequiredArgsConstructor
public class DataFiller {
    private final FormationRepository formationRepository;
    private final MembreRepository membreRepository;

    @Bean
    public CommandLineRunner fillDb(){
        return args -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

            Formation formation = new Formation();
            formation.setTitre("Java 17");
            formation.setDescription("Formation Java 17");
            formation.setDateDebut(LocalDate.parse("10/03/2024", formatter));
            formation.setDateFin(LocalDate.parse("12/03/2024", formatter));

            formationRepository.save(formation);

            formation = new Formation();
            formation.setTitre("Angular");
            formation.setDescription("Formation Angular");
            formation.setDateDebut(LocalDate.parse("13/03/2024", formatter));
            formation.setDateFin(LocalDate.parse("15/03/2024", formatter));

            formationRepository.save(formation);

            formation = new Formation();
            formation.setTitre("React");
            formation.setDescription("Formation react");
            formation.setDateDebut(LocalDate.parse("16/03/2024", formatter));
            formation.setDateFin(LocalDate.parse("20/03/2024", formatter));

            formationRepository.save(formation);

            Membre membre = new Membre();
            membre.setNom("Moha");
            membre.setEmail("moha@email.com");

            membreRepository.save(membre);

            membre = new Membre();
            membre.setNom("Danger");
            membre.setEmail("danger@email.com");

            membreRepository.save(membre);
        };
    }
}
