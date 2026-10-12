package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Employe;

public interface IEmployeService {
    List<Employe> retrieveAllEmployes();
    Employe retrieveEmploye(Long id);
    Employe addEmploye(Employe employe);
    void removeEmploye(Long id);
    Employe modifyEmploye(Employe employe);
}
