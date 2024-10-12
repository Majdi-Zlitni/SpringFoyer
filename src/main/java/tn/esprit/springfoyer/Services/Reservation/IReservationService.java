package tn.esprit.springfoyer.Services.Reservation;

import tn.esprit.springfoyer.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation add(Reservation Reservation);
    List<Reservation> addAll(List<Reservation> Reservations);
    Reservation update(Reservation Reservation);
    List<Reservation> updateAll(List<Reservation> Reservations);
    Reservation selectById(long id);
    List<Reservation> selectAll();
    void delete(Reservation Reservation);
    void deleteById(long id);
    void deleteAll(List<Reservation> Reservations);
    void deleteAll();
    long count();
}
