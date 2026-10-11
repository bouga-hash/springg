package tn.esprit.tp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Contrat;

public interface contractrepository extends JpaRepository<Contrat, Long> {
}
