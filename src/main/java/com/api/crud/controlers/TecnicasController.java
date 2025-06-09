package com.api.crud.controlers;

import com.api.crud.models.TecnicasModel;
import com.api.crud.services.TecnicasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/tecnicas")
public class TecnicasController {

    @Autowired
    private TecnicasService tecnicasService;

    @GetMapping
    public ArrayList<TecnicasModel> getTecnicas() {
        return this.tecnicasService.getTecnicas();

    }

    @PostMapping
    public TecnicasModel saveTecnicas(@RequestBody TecnicasModel tecnica) {
        return this.tecnicasService.saveTecnicas(tecnica);
    }

    @GetMapping(path = "/{id}")
    public Optional<TecnicasModel> getTecnicasById(@PathVariable("id") Long id){
        return this.tecnicasService.getTecnicasById(id);
    }

    @PutMapping(path = "/{id}")
    public TecnicasModel updateTecnicasById(@RequestBody TecnicasModel request,@PathVariable("id") Long id) {
        return this.tecnicasService.updateTecnicasById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteTecnicasById(@PathVariable("id") Long id) {
        boolean ok = this.tecnicasService.deleteTecnicasById(id);
        if(ok){
            return "Tecnica con id "+ id +" eliminado";
        }  else {
            return "no se pudo eliminar la tecnica con id " + id;
        }
    }
}
