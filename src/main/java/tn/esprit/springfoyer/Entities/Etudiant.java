package tn.esprit.springfoyer.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name="Etudiant")
public class Etudiant {
    @Id
    long idEtudiant;
    String nomEt;
    String prenomEt;
    @Column(unique = true)
    long cin;
    String ecole;
    LocalDate dateNaissance;
    @ManyToMany(mappedBy = "listetudiants")
    List<Reservation> listreservations;
}
