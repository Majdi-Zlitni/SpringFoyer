package tn.esprit.springfoyer.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springfoyer.Services.Foyer.IFoyerService;

@RestController//=> Spring va considérer cette classe comme un controller
@RequestMapping("Foyer")//=> localhost:8080//Foyer
@AllArgsConstructor//=> Lombok va générer un constructeur avec tous les arguments pour notre classe(dependency injection)
public class FoyerRestController {
    //@ Component=> Spring va scanner les classes et les traiter comme des beans
    IFoyerService FoyerService;
    @GetMapping("getAll")
    public String getAll(){
        return FoyerService.selectAll().toString();
    }
}
