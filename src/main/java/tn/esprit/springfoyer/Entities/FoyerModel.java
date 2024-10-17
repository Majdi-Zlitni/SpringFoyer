package tn.esprit.springfoyer.Entities;


import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFoyer;
    String nomFoyer;
    String capaciteFoyer;
    //Universite universite;//= new Universite();
    @OneToOne(mappedBy = "foyer")
    Universite uni;


}
