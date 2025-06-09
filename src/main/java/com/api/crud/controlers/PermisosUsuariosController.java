package com.api.crud.controlers;

import com.api.crud.models.PermisosUsuariosModel;
import com.api.crud.services.PermisosUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/permisosusuarios")
public class PermisosUsuariosController {

    @Autowired
    private PermisosUsuariosService permisosUsuariosService;

    @GetMapping
    public ArrayList<PermisosUsuariosModel> getPermisosUsuarios() {
        return this.permisosUsuariosService.getPermisosUsuarios();

    }

    @PostMapping
    public PermisosUsuariosModel savePermisosUsuarios(@RequestBody PermisosUsuariosModel permisosUsuarios) {
        return this.permisosUsuariosService.savePermisosUsuarios(permisosUsuarios);
    }

    @GetMapping(path = "/{id}")
    public Optional<PermisosUsuariosModel> getPermisosUsuariosById(@PathVariable("id") Long id){
        return this.permisosUsuariosService.getPermisosUsuariosById(id);
    }

    @PutMapping(path = "/{id}")
    public PermisosUsuariosModel updatePermisosUsuarioById(@RequestBody PermisosUsuariosModel request,@PathVariable("id") Long id) {
        return this.permisosUsuariosService.updatePermisosUsuariosById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUsuarioById(@PathVariable("id") Long id) {
        boolean ok = this.permisosUsuariosService.deletePermisosUsuariosById(id);
        if(ok){
            return "PermisosUsuarios con id "+ id +" eliminado";
        }  else {
            return "no se pudo eliminar el PermisoUsuario con id " + id;
        }
    }
}