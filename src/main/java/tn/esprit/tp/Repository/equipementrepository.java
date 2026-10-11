package tn.esprit.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Equipement;

public interface equipementrepository extends JpaRepository<Equipement, Long> {
}
