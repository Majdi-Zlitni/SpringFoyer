package tn.esprit.springfoyer.Services.Chambre;
import java.util.List;
import tn.esprit.springfoyer.Entities.Chambre;
import tn.esprit.springfoyer.Repositorie.IChambreRepo;
public class ChambreService implements IChambreService {
    IChambreRepo ChambreRepository;

    @Override
    public Chambre add(Chambre chambre) {
        return ChambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> addAll(List<Chambre> chambres) {
        return ChambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre update(Chambre chambre) {
        return ChambreRepository.save(chambre);//
    }

    @Override
    public List<Chambre> updateAll(List<Chambre> chambres) {
        return ChambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre selectById(long id) {
        return ChambreRepository.findById(id).get();//ken l9at el user traj3ou, sinon trajaa objet vide

    }

    @Override
    public List<Chambre> selectAll() {
        return ChambreRepository.findAll();
    }

    @Override
    public void delete(Chambre chambre) {
        ChambreRepository.delete(chambre);
    }

    @Override
    public void deleteById(long id) {
        ChambreRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<Chambre> chambres) {
        ChambreRepository.deleteAll(chambres);
    }

    @Override
    public void deleteAll() {
        ChambreRepository.deleteAll();
    }

    @Override
    public long count() {
        return ChambreRepository.count();
    }
}
