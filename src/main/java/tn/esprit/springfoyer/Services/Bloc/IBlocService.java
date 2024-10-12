package tn.esprit.springfoyer.Services.Bloc;

import tn.esprit.springfoyer.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc add(Bloc bloc);
    List<Bloc> addAll(List<Bloc> blocs);
    Bloc update(Bloc bloc);
    List<Bloc> updateAll(List<Bloc> blocs);
    Bloc selectById(long id);
    List<Bloc> selectAll();
    void delete(Bloc bloc);
    void deleteById(long id);
    void deleteAll(List<Bloc> blocs);
    void deleteAll();
    long count();
}
