package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.contractrepository;
import tn.esprit.tp.entity.Contrat;
import tn.esprit.tp.services.interfaces.IContratService;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {
    private final contractrepository contratRepository;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat retrieveContrat(Long id) {
        return contratRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contrat introuvable : " + id));
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void removeContrat(Long id) {
        retrieveContrat(id);
        contratRepository.deleteById(id);
    }

    @Override
    public Contrat modifyContrat(Contrat contrat) {
        retrieveContrat(contrat.getIdContrat());
        return contratRepository.save(contrat);
    }
}
