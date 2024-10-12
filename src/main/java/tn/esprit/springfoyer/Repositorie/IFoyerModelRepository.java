package tn.esprit.springfoyer.Repositorie;
//nom de class et type Objet de l'ID
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfoyer.Entities.FoyerModel;

public interface IFoyerModelRepository extends JpaRepository<FoyerModel,Long>{

}
