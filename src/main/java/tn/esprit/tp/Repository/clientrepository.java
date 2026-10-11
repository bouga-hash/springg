package tn.esprit.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Client;

public interface clientrepository extends JpaRepository<Client, Long> {
}
