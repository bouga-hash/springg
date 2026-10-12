package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Vehicule;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();
    Vehicule retrieveVehicule(Long id);
    Vehicule addVehicule(Vehicule vehicule);
    void removeVehicule(Long id);
    Vehicule modifyVehicule(Vehicule vehicule);
}
