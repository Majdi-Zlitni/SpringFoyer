package tn.esprit.springfoyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
@Entity
public class Bloc {
    @Id
    long idBlog;
    String nomBloc;
    long capaciteBloc;
    //List<chambre> chambre;//=new List<Chambre>();
}
