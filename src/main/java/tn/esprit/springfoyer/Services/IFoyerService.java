package tn.esprit.springfoyer.Services;

import tn.esprit.springfoyer.Entities.FoyerModel;

import java.util.List;

public interface IFoyerService {

    FoyerModel add(FoyerModel FoyerModel);
    List<FoyerModel> addAll(List<FoyerModel> FoyerModels);
    FoyerModel update(FoyerModel FoyerModel);
    List<FoyerModel> updateAll(List<FoyerModel> FoyerModels);
    FoyerModel selectById(long id);
    List<FoyerModel> selectAll();
    void delete(FoyerModel FoyerModel);
    void deleteById(long id);
    void deleteAll(List<FoyerModel> FoyerModels);
    void deleteAll();
    long count();
}
