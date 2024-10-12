package tn.esprit.springfoyer.Repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfoyer.Entities.Chambre;

public interface IChambreRepo extends JpaRepository<Chambre, Long> {
}
