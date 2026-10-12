package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.equipementrepository;
import tn.esprit.tp.entity.Equipement;
import tn.esprit.tp.services.interfaces.IEquipementService;

@Service
@AllArgsConstructor
public class EquipementServiceImpl implements IEquipementService {
    private final equipementrepository equipementRepository;

    @Override
    public List<Equipement> retrieveAllEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement retrieveEquipement(Long id) {
        return equipementRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Equipement introuvable : " + id));
    }

    @Override
    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void removeEquipement(Long id) {
        retrieveEquipement(id);
        equipementRepository.deleteById(id);
    }

    @Override
    public Equipement modifyEquipement(Equipement equipement) {
        retrieveEquipement(equipement.getIdEquipement());
        return equipementRepository.save(equipement);
    }
}
