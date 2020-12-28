package com.example.projet1.projet1;


import com.example.projet1.projet1.EtudiantRepository;
import com.example.projet1.projet1.Etudiants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/mariadb")
public class EtudiantController {

    @Autowired
   private EtudiantRepository repository;

//    @RequestMapping(value = "/etudiant",method = RequestMethod.GET)
//    public String getStudents()
//    {
//        return "cooool";
//    }

    @GetMapping(path = "/etudiants")
    public List<Etudiants> getStage()
    {
        return repository.findAll();
    }


    @PostMapping(path = "/add1")
    public @ResponseBody Etudiants addStage(@RequestBody Etudiants p)
    {
        return repository.save(p);
    }

    @RequestMapping(path = "/addStage")
    public Boolean addStage(@RequestParam(name = "num_etudiant",defaultValue = "null") String num_etudiant,
                            @RequestParam(name = "prenom",defaultValue = "null") String prenom,
                            @RequestParam(name = "nom",defaultValue = "null") String nom,
                            @RequestParam(name = "nom_entreprise",defaultValue = "null") String nom_entreprise)
    {
        repository.save(new Etudiants(num_etudiant,prenom,nom,nom_entreprise));
        return true;
    }
}
