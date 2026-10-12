package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Paiement;

public interface IPaiementService {
    List<Paiement> retrieveAllPaiements();
    Paiement retrievePaiement(Long id);
    Paiement addPaiement(Paiement paiement);
    void removePaiement(Long id);
    Paiement modifyPaiement(Paiement paiement);
}
