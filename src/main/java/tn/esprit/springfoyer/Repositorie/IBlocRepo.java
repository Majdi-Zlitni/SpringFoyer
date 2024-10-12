package tn.esprit.springfoyer.Repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfoyer.Entities.Bloc;

public interface IBlocRepo extends JpaRepository<Bloc, Integer> {
}
