package tn.esprit.springfoyer.Services.Universite;

import tn.esprit.springfoyer.Entities.Universite;
import tn.esprit.springfoyer.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite add(Universite Universite);
    List<Universite> addAll(List<Universite> Universites);
    Universite update(Universite Universite);
    List<Universite> updateAll(List<Universite> Universites);
    Universite selectById(long id);
    List<Universite> selectAll();
    void delete(Universite Universite);
    void deleteById(long id);
    void deleteAll(List<Universite> Universites);
    void deleteAll();
    long count();
}
