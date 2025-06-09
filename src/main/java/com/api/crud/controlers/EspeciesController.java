package com.api.crud.controlers;

import com.api.crud.models.EspeciesModel;
import com.api.crud.services.EspeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/especies")
public class EspeciesController {

    @Autowired
    private EspeciesService especiesService;

    @GetMapping
    public ArrayList<EspeciesModel> getEspecies() {
        return this.especiesService.getEspecies();

    }

    @PostMapping
    public EspeciesModel saveEspecies(@RequestBody EspeciesModel especies) {
        return this.especiesService.saveEspecie(especies);
    }

    @GetMapping(path = "/{id}")
    public Optional<EspeciesModel> getEspeciesById(@PathVariable("id") Long id){
        return this.especiesService.getEspeciesById(id);
    }

    @PutMapping(path = "/{id}")
    public EspeciesModel updateEspeciesById(@RequestBody EspeciesModel request,@PathVariable("id") Long id) {
        return this.especiesService.updateEspeciesById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteEspeciesById(@PathVariable("id") Long id) {
        boolean ok = this.especiesService.deleteEspeciesById(id);
        if(ok){
            return "Especie con id "+ id +" eliminada";
        }  else {
            return "o se pudo eliminar la Especie con id " + id;
        }
    }
}
