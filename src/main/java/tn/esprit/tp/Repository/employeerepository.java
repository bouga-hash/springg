package tn.esprit.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.tp.entity.Employe;

import java.util.List;

public interface employeerepository extends JpaRepository<Employe, Long> {
    @Query("select e from Employe e")
    List<Employe> retrieveAllEmployees();

}
