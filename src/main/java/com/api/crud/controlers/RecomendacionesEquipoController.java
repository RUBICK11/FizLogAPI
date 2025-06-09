package com.api.crud.controlers;

import com.api.crud.models.RecomendacionesEquipoModel;
import com.api.crud.services.RecomendacionesEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/recomendacionesequipo")
public class RecomendacionesEquipoController {

    @Autowired
    private RecomendacionesEquipoService recomendacionesEquipoService;

    @GetMapping
    public ArrayList<RecomendacionesEquipoModel> getRecomendacionesEquipo() {
        return this.recomendacionesEquipoService.getRecomendacionesEquipo();

    }

    @PostMapping
    public RecomendacionesEquipoModel saveRecomendacionesEquipo(@RequestBody RecomendacionesEquipoModel recomendacionEquipo) {
        return this.recomendacionesEquipoService.saveRecomendacionesEquipo(recomendacionEquipo);
    }

    @GetMapping(path = "/{id}")
    public Optional<RecomendacionesEquipoModel> getRecomendacionesEquipoById(@PathVariable("id") Long id){
        return this.recomendacionesEquipoService.getRecomendacionesEquipoById(id);
    }

    @PutMapping(path = "/{id}")
    public RecomendacionesEquipoModel updateRecomendacionesEquipoById(@RequestBody RecomendacionesEquipoModel request,@PathVariable("id") Long id) {
        return this.recomendacionesEquipoService.updateRecomendacionesEquipoById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteRecomendacionesEquipoById(@PathVariable("id") Long id) {
        boolean ok = this.recomendacionesEquipoService.deleteRecomendacionesEquipoById(id);
        if(ok){
            return "RecomendacionEquipo con id "+ id +" eliminado";
        }  else {
            return "no se pudo eliminar la RecomendacionEquipo con id " + id;
        }
    }
}
