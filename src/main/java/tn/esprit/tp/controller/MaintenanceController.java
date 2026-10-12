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
import tn.esprit.tp.entity.Maintenance;
import tn.esprit.tp.services.interfaces.IMaintenanceService;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {
    private final IMaintenanceService maintenanceService;

    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> getMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }

    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        return maintenanceService.retrieveMaintenance(maintenanceId);
    }

    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @DeleteMapping("/remove-maintenance")
    public void removeMaintenance(@RequestParam("maintenanceId") Long maintenanceId) {
        maintenanceService.removeMaintenance(maintenanceId);
    }

    @PutMapping("/modify-maintenance")
    public Maintenance modifyMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifyMaintenance(maintenance);
    }
}
