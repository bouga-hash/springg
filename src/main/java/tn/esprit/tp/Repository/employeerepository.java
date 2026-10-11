package tn.esprit.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Employe;

public interface employeerepository extends JpaRepository<Employe, Long> {
}
