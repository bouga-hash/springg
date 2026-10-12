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
import tn.esprit.tp.entity.Contrat;
import tn.esprit.tp.services.interfaces.IContratService;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratController {
    private final IContratService contratService;

    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrats() {
        return contratService.retrieveAllContrats();
    }

    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        return contratService.retrieveContrat(contratId);
    }

    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @DeleteMapping("/remove-contrat")
    public void removeContrat(@RequestParam("contratId") Long contratId) {
        contratService.removeContrat(contratId);
    }

    @PutMapping("/modify-contrat")
    public Contrat modifyContrat(@RequestBody Contrat contrat) {
        return contratService.modifyContrat(contrat);
    }
}
