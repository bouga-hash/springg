package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Agence;

public interface IAgenceService {
    List<Agence> retrieveAllAgences();
    Agence retrieveAgence(Long id);
    Agence addAgence(Agence agence);
    void removeAgence(Long id);
    Agence modifyAgence(Agence agence);
}
