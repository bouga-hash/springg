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
import tn.esprit.tp.entity.Equipement;
import tn.esprit.tp.services.interfaces.IEquipementService;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {
    private final IEquipementService equipementService;

    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        return equipementService.retrieveEquipement(equipementId);
    }

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @DeleteMapping("/remove-equipement")
    public void removeEquipement(@RequestParam("equipementId") Long equipementId) {
        equipementService.removeEquipement(equipementId);
    }

    @PutMapping("/modify-equipement")
    public Equipement modifyEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifyEquipement(equipement);
    }
}
