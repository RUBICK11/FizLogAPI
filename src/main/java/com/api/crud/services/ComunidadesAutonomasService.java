package com.api.crud.services;

import com.api.crud.models.ComunidadesAutonomasModel;
import com.api.crud.repositories.IComunidadesAutonomasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComunidadesAutonomasService {

    @Autowired
    IComunidadesAutonomasRepository comunidadesAutonomasRepository;

    public ArrayList<ComunidadesAutonomasModel> getComunidadesAutonomas() {
        return (ArrayList<ComunidadesAutonomasModel>) comunidadesAutonomasRepository.findAll();
    }

    public ComunidadesAutonomasModel saveComunidadesAutonomas(ComunidadesAutonomasModel comunidad){
        return comunidadesAutonomasRepository.save(comunidad);
    }

    public Optional<ComunidadesAutonomasModel> getComunidadesAutonomasById(Long id){
        return comunidadesAutonomasRepository.findById(id);
    }

    public ComunidadesAutonomasModel updateComunidadesAutonmomasById(ComunidadesAutonomasModel request, Long id){
        ComunidadesAutonomasModel comunidad = comunidadesAutonomasRepository.findById(id).get();
        comunidad.setNombre(request.getNombre());
        return comunidad;
    }

    public Boolean deleteComunidadesAutonomasById(Long id){
        try {
            comunidadesAutonomasRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
