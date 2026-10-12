package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.repositoryreservation;
import tn.esprit.tp.entity.Reservation;
import tn.esprit.tp.services.interfaces.IReservationService;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    private final repositoryreservation reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation introuvable : " + id));
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void removeReservation(Long id) {
        retrieveReservation(id);
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        retrieveReservation(reservation.getIdReservation());
        return reservationRepository.save(reservation);
    }
}
