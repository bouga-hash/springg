package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Contrat;

public interface IContratService {
    List<Contrat> retrieveAllContrats();
    Contrat retrieveContrat(Long id);
    Contrat addContrat(Contrat contrat);
    void removeContrat(Long id);
    Contrat modifyContrat(Contrat contrat);
}
