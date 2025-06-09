package com.api.crud.services;

import com.api.crud.models.TecnicasModel;
import com.api.crud.repositories.ITecnicasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TecnicasService {

    @Autowired
    ITecnicasRepository tecnicasRepository;

    public ArrayList<TecnicasModel> getTecnicas(){
        return (ArrayList<TecnicasModel>) tecnicasRepository.findAll();
    }

    public TecnicasModel saveTecnicas(TecnicasModel tecnica){
        return tecnicasRepository.save(tecnica);
    }

    public Optional<TecnicasModel> getTecnicasById(Long id){
        return tecnicasRepository.findById(id);
    }

    public TecnicasModel updateTecnicasById(TecnicasModel request, Long id){
        TecnicasModel tecnicas = tecnicasRepository.findById(id).get();

        tecnicas.setNombre(request.getNombre());
        tecnicas.setDescripcion(request.getDescripcion());

        return tecnicas;
    }

    public Boolean deleteTecnicasById(Long id){
        try {
            tecnicasRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}