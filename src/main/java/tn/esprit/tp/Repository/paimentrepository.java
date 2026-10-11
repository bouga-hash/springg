package tn.esprit.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Paiement;

public interface paimentrepository extends JpaRepository<Paiement, Long> {
}
