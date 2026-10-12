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
import tn.esprit.tp.entity.Paiement;
import tn.esprit.tp.services.interfaces.IPaiementService;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {
    private final IPaiementService paiementService;

    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        return paiementService.retrievePaiement(paiementId);
    }

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @DeleteMapping("/remove-paiement")
    public void removePaiement(@RequestParam("paiementId") Long paiementId) {
        paiementService.removePaiement(paiementId);
    }

    @PutMapping("/modify-paiement")
    public Paiement modifyPaiement(@RequestBody Paiement paiement) {
        return paiementService.modifyPaiement(paiement);
    }
}
