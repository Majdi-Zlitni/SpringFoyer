package tn.esprit.springfoyer.Repositorie;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfoyer.Entities.Universite;

public interface IUniversiteRepo extends JpaRepository<Universite, Long> {
}
