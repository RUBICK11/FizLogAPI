package com.api.crud.services;

import com.api.crud.models.PermisosUsuariosModel;
import com.api.crud.repositories.IPermisosUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PermisosUsuariosService {

    @Autowired
    IPermisosUsuariosRepository permisosUsuariosRepository;

    public ArrayList<PermisosUsuariosModel> getPermisosUsuarios(){
        return (ArrayList<PermisosUsuariosModel>) permisosUsuariosRepository.findAll();
    }

    public PermisosUsuariosModel savePermisosUsuarios(PermisosUsuariosModel permisosUsuarios){
        return permisosUsuariosRepository.save(permisosUsuarios);
    }

    public Optional<PermisosUsuariosModel> getPermisosUsuariosById(Long id){
        return permisosUsuariosRepository.findById(id);
    }

    public PermisosUsuariosModel updatePermisosUsuariosById(PermisosUsuariosModel request, Long id){
        PermisosUsuariosModel permisosUsuarios = permisosUsuariosRepository.findById(id).get();

        permisosUsuarios.setIdusuarioorigen(request.getIdusuarioorigen());
        permisosUsuarios.setIdusuariodestino(request.getIdusuariodestino());
        permisosUsuarios.setPuedeVer(request.getPuedeVer());

        return permisosUsuarios;
    }

    public Boolean deletePermisosUsuariosById(Long id){
        try {
            permisosUsuariosRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
