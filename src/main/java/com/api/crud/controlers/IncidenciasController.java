package com.api.crud.controlers;

import com.api.crud.models.IncidenciasModel;
import com.api.crud.services.IncidenciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/incidencias")
public class IncidenciasController {

    @Autowired
    private IncidenciasService incidenciasService;

    @GetMapping
    public ArrayList<IncidenciasModel> getIncidencias() {
        return this.incidenciasService.getincidencias();

    }

    @PostMapping
    public IncidenciasModel saveUsuario(@RequestBody IncidenciasModel incidencias) {
        return this.incidenciasService.saveIncidencia(incidencias);
    }

    @GetMapping(path = "/{id}")
    public Optional<IncidenciasModel> getIncidenciasById(@PathVariable("id") Long id){
        return this.incidenciasService.getIncidenciasById(id);
    }

    @PutMapping(path = "/{id}")
    public IncidenciasModel updateIncidenciasById(@RequestBody IncidenciasModel request,@PathVariable("id") Long id) {
        return this.incidenciasService.updateIncidenciasById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteIncidenciasById(@PathVariable("id") Long id) {
        boolean ok = this.incidenciasService.deleteIncidenciasById(id);
        if(ok){
            return "Incidencia con id "+ id +" eliminada";
        }  else {
            return "no se pudo eliminar la Incidencia con id " + id;
        }
    }
}
