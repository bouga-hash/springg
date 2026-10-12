package tn.esprit.tp.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tp.entity.Agence;
import tn.esprit.tp.services.interfaces.IAgenceService;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {
    private final IAgenceService agenceService;

    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAgences() {
        return agenceService.retrieveAllAgences();
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        return agenceService.retrieveAgence(agenceId);
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @DeleteMapping("/remove-agence")
    public void removeAgence(@RequestParam("agenceId") Long agenceId) {
        agenceService.removeAgence(agenceId);
    }

    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence agence) {
        return agenceService.modifyAgence(agence);
    }
}
