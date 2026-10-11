package tn.esprit.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Reservation;

public interface repositoryreservation extends JpaRepository<Reservation, Long> {
}
