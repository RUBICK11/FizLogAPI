package com.api.crud.services;

import com.api.crud.models.UsuariosModel;
import com.api.crud.repositories.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    IUsuariosRepository usuariosRepository;

    public ArrayList<UsuariosModel> getUsuarios(){
        return (ArrayList<UsuariosModel>) usuariosRepository.findAll();
    }

    public UsuariosModel saveUsuarios(UsuariosModel usuarios){
        return usuariosRepository.save(usuarios);
    }

    public Optional<UsuariosModel> getUsuariosById(Long id){
        return usuariosRepository.findById(id);
    }

    public UsuariosModel updateUsuariosById(UsuariosModel request, Long id){
        UsuariosModel usuarios = usuariosRepository.findById(id).get();

        usuarios.setNombre(request.getNombre());
        usuarios.setApellido(request.getApellido());
        usuarios.setEmail(request.getEmail());
        usuarios.setNombreUsuario(request.getNombreUsuario());
        usuarios.setEmail(request.getEmail());
        usuarios.setContrasenia(request.getContrasenia());
        usuarios.setRol(request.getRol());

        return usuarios;
    }

    public Boolean deleteUsuariosById(Long id){
        try {
            usuariosRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
