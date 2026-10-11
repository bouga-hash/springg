package tn.esprit.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Vehicule;

public interface vehiculereposiroty   extends JpaRepository<Vehicule, Long> {
}
