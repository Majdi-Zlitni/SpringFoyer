package tn.esprit.springfoyer.Repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfoyer.Entities.Etudiant;

public interface IEtudiantRepo extends JpaRepository<Etudiant, Long> {
}
