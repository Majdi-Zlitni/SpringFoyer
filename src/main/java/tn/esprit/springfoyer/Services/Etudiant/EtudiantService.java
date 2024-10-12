package tn.esprit.springfoyer.Services.Etudiant;

import tn.esprit.springfoyer.Entities.Etudiant;
import tn.esprit.springfoyer.Entities.FoyerModel;
import tn.esprit.springfoyer.Repositorie.IEtudiantRepo;

import java.util.List;

public class EtudiantService implements IEtudiantService {
    IEtudiantRepo EtudiantModelRepository;

    @Override
    public Etudiant add(Etudiant Etudiant) {
        return EtudiantModelRepository.save(Etudiant);
    }

    @Override
    public List<Etudiant> addAll(List<Etudiant> Etudiants) {
        return EtudiantModelRepository.saveAll(Etudiants);
    }

    @Override
    public Etudiant update(Etudiant Etudiant) {
        return EtudiantModelRepository.save(Etudiant);
    }

    @Override
    public List<Etudiant> updateAll(List<Etudiant> Etudiants) {
        return EtudiantModelRepository.saveAll(Etudiants);
    }

    @Override
    public Etudiant selectById(long id) {
        return EtudiantModelRepository.findById(id).get();
    }

    @Override
    public List<Etudiant> selectAll() {
        return EtudiantModelRepository.findAll();
    }
    @Override
    public void delete(Etudiant etudiant) {
        EtudiantModelRepository.delete(etudiant);
    }

    @Override
    public void deleteById(long id) {
        EtudiantModelRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<Etudiant> etudiants) {
        EtudiantModelRepository.deleteAll(etudiants);
    }

    @Override
    public void deleteAll() {
        EtudiantModelRepository.deleteAll();
    }

    @Override
    public long count() {
        return EtudiantModelRepository.count();
    }
}
