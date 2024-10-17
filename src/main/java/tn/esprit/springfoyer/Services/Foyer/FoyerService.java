package tn.esprit.springfoyer.Services.Foyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springfoyer.Entities.FoyerModel;
import tn.esprit.springfoyer.Repositorie.IFoyerModelRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    IFoyerModelRepository FoyerModelRepository;

    @Override
    public FoyerModel add(FoyerModel FoyerModel) {
        return FoyerModelRepository.save(FoyerModel);
    }

    @Override
    public List<FoyerModel> addAll(List<FoyerModel> FoyerModels) {
        return FoyerModelRepository.saveAll(FoyerModels);
    }

    @Override
    public FoyerModel update(FoyerModel FoyerModel) {
        return FoyerModelRepository.save(FoyerModel);//
    }

    @Override
    public List<FoyerModel> updateAll(List<FoyerModel> FoyerModels) {
        return FoyerModelRepository.saveAll(FoyerModels);
    }

    @Override
    public FoyerModel selectById(long id) {
        //return FoyerModelRepository.findById(id).get();//ken l9at el user traj3ou, sinon trajaa objet vide
        //return FoyerModelRepository.findById(id).orElse();//taatina possibilite bch nakhtarou chniya yarjaa kif yebda ma thamech fi el BD selon chniya mawjoud fi el Else
        return FoyerModelRepository.findById(id).orElse(FoyerModel
                .builder()
                .idFoyer(0)
                .nomFoyer("test")
                .capaciteFoyer("NAN")
                .build()
        );
    }

    @Override
    public List<FoyerModel> selectAll() {
        return FoyerModelRepository.findAll();
    }

    @Override
    public void delete(FoyerModel FoyerModel) {
        FoyerModelRepository.delete(FoyerModel);
    }

    @Override
    public void deleteById(long id) {
        FoyerModelRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<FoyerModel> FoyerModels) {
        FoyerModelRepository.deleteAll(FoyerModels);
    }

    @Override
    public void deleteAll() {
        FoyerModelRepository.deleteAll();
    }

    @Override
    public long count() {
        return FoyerModelRepository.count();
    }
}
