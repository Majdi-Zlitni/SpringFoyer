package tn.esprit.springfoyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name="Reservation")
public class Reservation {
    @Id
    String idReservation;
    LocalDate anneeUniversitaire;
    boolean estValide;
    @ManyToMany
    List<Etudiant> listetudiants;
}
