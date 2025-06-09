package com.api.crud.controlers;

import com.api.crud.models.UsuariosModel;
import com.api.crud.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public ArrayList<UsuariosModel> getUsuarios() {
        return this.usuariosService.getUsuarios();
    }

    @PostMapping
    public UsuariosModel saveUsuario(@RequestBody UsuariosModel usuarios) {
        return this.usuariosService.saveUsuarios(usuarios);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuariosModel> getUsuarioById(@PathVariable("id") Long id){
        return this.usuariosService.getUsuariosById(id);
    }

    @PutMapping(path = "/{id}")
    public UsuariosModel updateUsuarioById(@RequestBody UsuariosModel request,@PathVariable("id") Long id) {
        return this.usuariosService.updateUsuariosById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUsuarioById(@PathVariable("id") Long id) {
        boolean ok = this.usuariosService.deleteUsuariosById(id);
        if(ok){
            return "Usuario con id "+ id +" eliminado";
        }  else {
            return "Usuario no se pudo eliminar al usuario con id " + id;
        }
    }
}
