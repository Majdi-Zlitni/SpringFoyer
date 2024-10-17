package tn.esprit.springfoyer.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springfoyer.Entities.FoyerModel;
import tn.esprit.springfoyer.Services.Foyer.IFoyerService;

import java.util.List;

@RestController//=> Spring va considérer cette classe comme un controller
@RequestMapping("Foyer")//=> localhost:8080//Foyer
@AllArgsConstructor
//=> Lombok va générer un constructeur avec tous les arguments pour notre classe(dependency injection)
public class FoyerRestController {
    //@ Component=> Spring va scanner les classes et les traiter comme des beans
    IFoyerService FoyerService;

    @PostMapping("add")
    public FoyerModel Add(@RequestBody FoyerModel foyerModel) {//bch el valeur ely fi el postman yetaadaw
        return FoyerService.add(foyerModel);
    }

    @PostMapping("addAll")
    public List<FoyerModel> AddAll(@RequestBody List<FoyerModel> foyerModels) {
        return FoyerService.addAll(foyerModels);
    }

    @PutMapping("update")
    public FoyerModel Update(@RequestBody FoyerModel foyerModel) {
        return FoyerService.update(foyerModel);
    }

    @PutMapping("updateAll")
    public List<FoyerModel> UpdateAll(@RequestBody List<FoyerModel> foyerModels) {
        return FoyerService.updateAll(foyerModels);
    }
    //bch nakhou biha el raw json
    @GetMapping("getById")
    public FoyerModel getById(@RequestParam long id) {
        return FoyerService.selectById(id);
    }

    @GetMapping("getAll")
    public List getAll() {
        return FoyerService.selectAll();
    }

    @DeleteMapping("delete")
    public void Delete(@RequestBody FoyerModel foyerModel) {
        FoyerService.delete(foyerModel);
    }

    @DeleteMapping("deleteById")
    public void DeleteById(@RequestParam long id) {
        FoyerService.deleteById(id);
    }

    @DeleteMapping("deleteListOfFoyer")
    public void DeleteAll(@RequestBody List<FoyerModel> foyerModels) {
        FoyerService.deleteAll(foyerModels);
    }

    @DeleteMapping("deleteAll")
    public void DeleteAll() {
        FoyerService.deleteAll();
    }

    @GetMapping("count")
    public long Count() {
        return FoyerService.count();
    }
}
