package tn.esprit.springfoyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name="Universite")
@Entity
public class Universite {
@Id
    long idUniversite;
    String nomUniversite;
    String adresseUniversite;
    //FoyerModel foyer;4ivt13e1zs
    @OneToOne
    FoyerModel foyer;
}
