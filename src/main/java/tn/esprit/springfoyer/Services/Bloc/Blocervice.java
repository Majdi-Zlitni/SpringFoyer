package tn.esprit.springfoyer.Services.Bloc;
import tn.esprit.springfoyer.Entities.Bloc;
import tn.esprit.springfoyer.Repositorie.IBlocRepo;

import java.util.List;

public class Blocervice implements IBlocService{
    IBlocRepo BlocRepository;
    
    @Override
    public Bloc add(Bloc Bloc) {
        return BlocRepository.save(Bloc);
    }

    @Override
    public List<Bloc> addAll(List<Bloc> Bloc) {
        return BlocRepository.saveAll(Bloc);
    }

    @Override
    public Bloc update(Bloc Bloc) {
        return BlocRepository.save(Bloc);//
    }

    @Override
    public List<Bloc> updateAll(List<Bloc> Bloc) {
        return BlocRepository.saveAll(Bloc);
    }

    @Override
    public Bloc selectById(long id) {
        return BlocRepository.findById(id).get();
    }

    @Override
    public List<Bloc> selectAll() {
        return BlocRepository.findAll();
    }

    @Override
    public void delete(Bloc Bloc) {
        BlocRepository.delete(Bloc);
    }

    @Override
    public void deleteById(long id) {
        BlocRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<Bloc> Bloc) {
        BlocRepository.deleteAll(Bloc);
    }

    @Override
    public void deleteAll() {
        BlocRepository.deleteAll();
    }

    @Override
    public long count() {
        return BlocRepository.count();
    }
}
