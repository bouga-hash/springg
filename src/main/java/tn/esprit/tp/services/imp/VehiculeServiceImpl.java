package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.vehiculereposiroty;
import tn.esprit.tp.entity.Vehicule;
import tn.esprit.tp.services.interfaces.IVehiculeService;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {
    private final vehiculereposiroty vehiculeRepository;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule retrieveVehicule(Long id) {
        return vehiculeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vehicule introuvable : " + id));
    }

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void removeVehicule(Long id) {
        retrieveVehicule(id);
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule modifyVehicule(Vehicule vehicule) {
        retrieveVehicule(vehicule.getIdVehicule());
        return vehiculeRepository.save(vehicule);
    }
}
