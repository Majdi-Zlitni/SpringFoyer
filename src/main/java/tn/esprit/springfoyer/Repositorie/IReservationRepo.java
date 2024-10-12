package tn.esprit.springfoyer.Repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfoyer.Entities.Reservation;


import java.util.List;

public interface IReservationRepo extends JpaRepository<Reservation, Long> {
}
