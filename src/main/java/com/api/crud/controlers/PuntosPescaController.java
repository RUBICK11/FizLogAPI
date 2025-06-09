package com.api.crud.controlers;

import com.api.crud.models.PuntosPescaModel;
import com.api.crud.services.PuntosPescaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/puntospesca")
public class PuntosPescaController {

    @Autowired
    private PuntosPescaService puntosPescaService;

    @GetMapping
    public ArrayList<PuntosPescaModel> getPuntosPesca() {
        return this.puntosPescaService.getPuntosPesca();

    }

    @PostMapping
    public PuntosPescaModel savePuntosPesca(@RequestBody PuntosPescaModel puntoPesca) {
        return this.puntosPescaService.savePuntosPesca(puntoPesca);
    }

    @GetMapping(path = "/{id}")
    public Optional<PuntosPescaModel> getPuntosPescaById(@PathVariable("id") Long id){
        return this.puntosPescaService.getPuntosPescaById(id);
    }

    @PutMapping(path = "/{id}")
    public PuntosPescaModel updatePuntosPescaById(@RequestBody PuntosPescaModel request,@PathVariable("id") Long id) {
        return this.puntosPescaService.updatePuntosPescaById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUsuarioById(@PathVariable("id") Long id) {
        boolean ok = this.puntosPescaService.deletePuntosPescaById(id);
        if(ok){
            return "PuntoPesca con id "+ id +" eliminado";
        }  else {
            return "no se pudo eliminar PuntoPesca con id " + id;
        }
    }
}
