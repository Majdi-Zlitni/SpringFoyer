package tn.esprit.springfoyer.Services.Universite;

import tn.esprit.springfoyer.Entities.Universite;
import tn.esprit.springfoyer.Repositorie.IUniversiteRepo;

import java.util.List;

public class UniversiteService implements IUniversiteService {
    IUniversiteRepo universiteRepo;

    @Override
    public Universite add(Universite Universite) {
        return universiteRepo.save(Universite);
    }

    @Override
    public List<Universite> addAll(List<Universite> Universites) {
        return universiteRepo.saveAll(Universites);
    }

    @Override
    public Universite update(Universite Universite) {
        return universiteRepo.save(Universite);
    }

    @Override
    public List<Universite> updateAll(List<Universite> Universites) {
        return universiteRepo.saveAll(Universites);
    }

    @Override
    public Universite selectById(long id) {
        return universiteRepo.findById(id).get();//throw NoSuchElementException
    }

    @Override
    public List<Universite> selectAll() {
        return universiteRepo.findAll();
    }

    @Override
    public void delete(Universite Universite) {
        universiteRepo.delete(Universite);
    }

    @Override
    public void deleteById(long id) {
        universiteRepo.deleteById(id);
    }

    @Override
    public void deleteAll(List<Universite> Universites) {
        universiteRepo.deleteAll(Universites);
    }

    @Override
    public void deleteAll() {
        universiteRepo.deleteAll();
    }

    @Override
    public long count() {
        return universiteRepo.count();
    }
}
