package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Equipement;

public interface IEquipementService {
    List<Equipement> retrieveAllEquipements();
    Equipement retrieveEquipement(Long id);
    Equipement addEquipement(Equipement equipement);
    void removeEquipement(Long id);
    Equipement modifyEquipement(Equipement equipement);
}
