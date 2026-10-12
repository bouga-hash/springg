package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.employeerepository;
import tn.esprit.tp.entity.Employe;
import tn.esprit.tp.services.interfaces.IEmployeService;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmployeService {
    private final employeerepository employeRepository;

    @Override
    public List<Employe> retrieveAllEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe retrieveEmploye(Long id) {
        return employeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employe introuvable : " + id));
    }

    @Override
    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void removeEmploye(Long id) {
        retrieveEmploye(id);
        employeRepository.deleteById(id);
    }

    @Override
    public Employe modifyEmploye(Employe employe) {
        retrieveEmploye(employe.getIdEmploye());
        return employeRepository.save(employe);
    }
}
