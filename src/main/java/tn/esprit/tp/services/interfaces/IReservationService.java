package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Reservation;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(Long id);
    Reservation addReservation(Reservation reservation);
    void removeReservation(Long id);
    Reservation modifyReservation(Reservation reservation);
}
