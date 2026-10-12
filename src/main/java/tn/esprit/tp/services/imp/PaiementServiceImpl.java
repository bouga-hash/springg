package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.paimentrepository;
import tn.esprit.tp.entity.Paiement;
import tn.esprit.tp.services.interfaces.IPaiementService;

@Service
@AllArgsConstructor
public class PaiementServiceImpl implements IPaiementService {
    private final paimentrepository paiementRepository;

    @Override
    public List<Paiement> retrieveAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement retrievePaiement(Long id) {
        return paiementRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Paiement introuvable : " + id));
    }

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void removePaiement(Long id) {
        retrievePaiement(id);
        paiementRepository.deleteById(id);
    }

    @Override
    public Paiement modifyPaiement(Paiement paiement) {
        retrievePaiement(paiement.getIdPaiement());
        return paiementRepository.save(paiement);
    }
}
