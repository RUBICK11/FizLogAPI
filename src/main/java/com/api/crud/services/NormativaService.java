package com.api.crud.services;

import com.api.crud.models.NormativaModel;
import com.api.crud.repositories.INormativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class NormativaService {

    @Autowired
    INormativaRepository normativaRepository;

    public ArrayList<NormativaModel> getNormativas(){
        return (ArrayList<NormativaModel>) normativaRepository.findAll();
    }

    public NormativaModel saveNormativa(NormativaModel usuarios){
        return normativaRepository.save(usuarios);
    }

    public Optional<NormativaModel> getNormativasById(Long id){
        return normativaRepository.findById(id);
    }

    public NormativaModel updateNormativasById(NormativaModel request, Long id){
        NormativaModel normativa = normativaRepository.findById(id).get();

        normativa.setIdComunidad(request.getIdComunidad());
        normativa.setTitulo(request.getTitulo());
        normativa.setDescripcion(request.getDescripcion());

        return normativa;
    }

    public Boolean deleteNormativasById(Long id){
        try {
            normativaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}