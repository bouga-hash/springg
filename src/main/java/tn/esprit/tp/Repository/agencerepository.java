package tn.esprit.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Agence;

public interface agencerepository extends JpaRepository<Agence, Long> {
}