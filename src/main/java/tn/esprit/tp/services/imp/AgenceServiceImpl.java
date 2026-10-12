package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.agencerepository;
import tn.esprit.tp.entity.Agence;
import tn.esprit.tp.services.interfaces.IAgenceService;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {
    private final agencerepository agenceRepository;

    @Override
    public List<Agence> retrieveAllAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence retrieveAgence(Long id) {
        return agenceRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Agence introuvable : " + id));
    }

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void removeAgence(Long id) {
        retrieveAgence(id);
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence modifyAgence(Agence agence) {
        retrieveAgence(agence.getIdAgence());
        return agenceRepository.save(agence);
    }

    public List<Agence> getAllAgence() {
        return retrieveAllAgences();
    }

    public Agence updateAgence(Agence agence) {
        return modifyAgence(agence);
    }

    public void deleteAgence(Agence agence) {
        removeAgence(agence.getIdAgence());
    }
}
