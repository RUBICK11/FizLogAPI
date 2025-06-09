package com.api.crud.controlers;

import com.api.crud.models.NormativaModel;
import com.api.crud.services.NormativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/normativas")
public class NormativaController {

    @Autowired
    private NormativaService normativaService;

    @GetMapping
    public ArrayList<NormativaModel> getNormativas() {
        return this.normativaService.getNormativas();

    }

    @PostMapping
    public NormativaModel saveNormativa(@RequestBody NormativaModel normativa) {
        return this.normativaService.saveNormativa(normativa);
    }

    @GetMapping(path = "/{id}")
    public Optional<NormativaModel> getNormativasById(@PathVariable("id") Long id){
        return this.normativaService.getNormativasById(id);
    }

    @PutMapping(path = "/{id}")
    public NormativaModel updateNormativasById(@RequestBody NormativaModel request,@PathVariable("id") Long id) {
        return this.normativaService.updateNormativasById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteNormativasById(@PathVariable("id") Long id) {
        boolean ok = this.normativaService.deleteNormativasById(id);
        if(ok){
            return "Normativa con id "+ id +" eliminada";
        }  else {
            return "no se pudo eliminar la Normativa con id " + id;
        }
    }
}