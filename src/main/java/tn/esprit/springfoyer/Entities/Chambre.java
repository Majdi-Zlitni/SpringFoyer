package tn.esprit.springfoyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Chambre {
    @Id
    long idChambre;
    long numchambre;
    String TypeC;
    @OneToMany
    List<Reservation> reservationList;
}
