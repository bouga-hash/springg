package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Maintenance;

public interface IMaintenanceService {
    List<Maintenance> retrieveAllMaintenances();
    Maintenance retrieveMaintenance(Long id);
    Maintenance addMaintenance(Maintenance maintenance);
    void removeMaintenance(Long id);
    Maintenance modifyMaintenance(Maintenance maintenance);
}
