package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.maintenancerepository;
import tn.esprit.tp.entity.Maintenance;
import tn.esprit.tp.services.interfaces.IMaintenanceService;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {
    private final maintenancerepository maintenanceRepository;

    @Override
    public List<Maintenance> retrieveAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance retrieveMaintenance(Long id) {
        return maintenanceRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Maintenance introuvable : " + id));
    }

    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void removeMaintenance(Long id) {
        retrieveMaintenance(id);
        maintenanceRepository.deleteById(id);
    }

    @Override
    public Maintenance modifyMaintenance(Maintenance maintenance) {
        retrieveMaintenance(maintenance.getIdMaintenance());
        return maintenanceRepository.save(maintenance);
    }
}
