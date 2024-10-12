package tn.esprit.springfoyer.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor//personaliser ama bel anotaion hedhy lazemna seule constructeur
//donc nzidou @NonNull
//donc nwaliw nestaamlou @builder
@Builder

//modificateur d'accerer (private,
@FieldDefaults(level = AccessLevel.PRIVATE)//bch el attribute el kol yethatou private
@Entity
@Table(name = "Foyer")
public class FoyerModel {
    @Id
    long idFoyer;
    String nomFoyer;
    String capaciteFoyer;
    //Universite universite;//= new Universite();
    @OneToOne(mappedBy = "foyer")
    Universite uni;


}
