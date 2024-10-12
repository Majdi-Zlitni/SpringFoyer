package tn.esprit.springfoyer.Services.Etudiant;

import tn.esprit.springfoyer.Entities.Etudiant;

import java.util.List;
//TODO: Why some method are gray?
public interface IEtudiantService {
    Etudiant add(Etudiant etudiant);
    List<Etudiant> addAll(List<Etudiant> etudiants);
    Etudiant update(Etudiant etudiants);
    List<Etudiant> updateAll(List<Etudiant> etudiants);
    Etudiant selectById(long id);
    List<Etudiant> selectAll();
    void delete(Etudiant Etudiant);
    void deleteById(long id);
    void deleteAll(List<Etudiant> etudiants);
    void deleteAll();
    long count();
}
