package tn.esprit.springfoyer.Services.Reservation;

import tn.esprit.springfoyer.Entities.Reservation;

import java.util.List;

public class ReservationService implements IReservationService {
    IReservationService ReservationModelRepository;

    @Override
    public Reservation add(Reservation Reservation) {
        return ReservationModelRepository.add(Reservation);
    }

    @Override
    public List<Reservation> addAll(List<Reservation> Reservations) {
        return ReservationModelRepository.addAll(Reservations);
    }

    @Override
    public Reservation update(Reservation Reservation) {
        return ReservationModelRepository.update(Reservation);
    }

    @Override
    public List<Reservation> updateAll(List<Reservation> Reservations) {
        return ReservationModelRepository.updateAll(Reservations);
    }

    @Override
    public Reservation selectById(long id) {
    //return ReservationModelRepository.findById(id).get();
        //TODO: findBy(id) didn't work why?
        //return ReservationModelRepository.findById(id).orElseThrow(() -> new RuntimeException("Reservation not found"));
        return ReservationModelRepository.selectById(id);// This could throw an exception
    }

    @Override
    public List<Reservation> selectAll() {
        return ReservationModelRepository.selectAll();
    }

    @Override
    public void delete(Reservation Reservation) {
        ReservationModelRepository.delete(Reservation);
    }

    @Override
    public void deleteById(long id) {
        ReservationModelRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<Reservation> Reservations) {
        ReservationModelRepository.deleteAll(Reservations);
    }

    @Override
    public void deleteAll() {
        ReservationModelRepository.deleteAll();
    }

    @Override
    public long count() {
        return ReservationModelRepository.count();
    }
}
