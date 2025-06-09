package com.api.crud.controlers;

import com.api.crud.models.ComunidadesAutonomasModel;
import com.api.crud.services.ComunidadesAutonomasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/comunidadesautonomas")
public class ComunidadesAutonomasController {

    @Autowired
    private ComunidadesAutonomasService comunidadesAutonomasService;

    @GetMapping
    public ArrayList<ComunidadesAutonomasModel> getComunidadesAutonomas() {
        return this.comunidadesAutonomasService.getComunidadesAutonomas();

    }

    @PostMapping
    public ComunidadesAutonomasModel saveComunidadesAutonomas(@RequestBody ComunidadesAutonomasModel comunidad) {
        return this.comunidadesAutonomasService.saveComunidadesAutonomas(comunidad);
    }

    @GetMapping(path = "/{id}")
    public Optional<ComunidadesAutonomasModel> getComunidadesAutonomasById(@PathVariable("id") Long id){
        return this.comunidadesAutonomasService.getComunidadesAutonomasById(id);
    }

    @PutMapping(path = "/{id}")
    public ComunidadesAutonomasModel updateComunidadesAutonomasById(@RequestBody ComunidadesAutonomasModel request,@PathVariable("id") Long id) {
        return this.comunidadesAutonomasService.updateComunidadesAutonmomasById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteComunidadesAutonomasById(@PathVariable("id") Long id) {
        boolean ok = this.comunidadesAutonomasService.deleteComunidadesAutonomasById(id);
        if(ok){
            return "Comunidad autonoma con id "+ id +" eliminada";
        }  else {
            return "No se pudo eliminar la comunida autonoma con id " + id;
        }
    }
}