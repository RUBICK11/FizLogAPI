package com.api.crud.controlers;

import com.api.crud.models.DatosPescaModel;
import com.api.crud.services.DatosPescaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/datospesca")
public class DatosPescaController {

    @Autowired
    private DatosPescaService datosPescaService;

    @GetMapping
    public ArrayList<DatosPescaModel> getDatosPesca() {
        return this.datosPescaService.getDatosPesca();

    }

    @PostMapping
    public DatosPescaModel saveDatosPesca(@RequestBody DatosPescaModel datoPesca) {
        return this.datosPescaService.saveDatosPesca(datoPesca);
    }

    @GetMapping(path = "/{id}")
    public Optional<DatosPescaModel> getDatosPescaById(@PathVariable("id") Long id){
        return this.datosPescaService.getDatosPescaById(id);
    }

    @PutMapping(path = "/{id}")
    public DatosPescaModel updateDatosPescaById(@RequestBody DatosPescaModel request,@PathVariable("id") Long id) {
        return this.datosPescaService.updateDatosPescaById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteDatosPescaById(@PathVariable("id") Long id) {
        boolean ok = this.datosPescaService.deleteDatosPescaById(id);
        if(ok){
            return "DatoPesca con id "+ id +" eliminado";
        }  else {
            return "no se pudo eliminar el DatoPesca con id " + id;
        }
    }
}