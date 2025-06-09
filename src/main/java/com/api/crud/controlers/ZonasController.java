package com.api.crud.controlers;

import com.api.crud.models.ZonasModel;
import com.api.crud.services.ZonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/zonas")
public class ZonasController {

    @Autowired
    private ZonasService zonasService;

    @GetMapping
    public ArrayList<ZonasModel> getZonas() {
        return this.zonasService.getZonas();

    }

    @PostMapping
    public ZonasModel saveZonas(@RequestBody ZonasModel zona) {
        return this.zonasService.saveZonas(zona);
    }

    @GetMapping(path = "/{id}")
    public Optional<ZonasModel> getZonasById(@PathVariable("id") Long id){
        return this.zonasService.getZonasById(id);
    }

    @PutMapping(path = "/{id}")
    public ZonasModel updateZonasById(@RequestBody ZonasModel request,@PathVariable("id") Long id) {
        return this.zonasService.updateZonasById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteZonasById(@PathVariable("id") Long id) {
        boolean ok = this.zonasService.deleteZonasById(id);
        if(ok){
            return "Zona con id "+ id +" eliminado";
        }  else {
            return "no se pudo eliminar la zona con id " + id;
        }
    }
}
