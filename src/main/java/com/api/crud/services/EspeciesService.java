package com.api.crud.services;

import com.api.crud.models.EspeciesModel;
import com.api.crud.repositories.IEspeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EspeciesService {

    @Autowired
    IEspeciesRepository especiesRepository;

    public ArrayList<EspeciesModel> getEspecies() {
        return (ArrayList<EspeciesModel>) especiesRepository.findAll();
    }

    public EspeciesModel saveEspecie(EspeciesModel especie){
        return especiesRepository.save(especie);
    }

    public Optional<EspeciesModel> getEspeciesById(Long id){
        return especiesRepository.findById(id);
    }

    public EspeciesModel updateEspeciesById(EspeciesModel request, Long id){
        EspeciesModel especie = especiesRepository.findById(id).get();

        especie.setNombre_comun(request.getNombre_comun());
        especie.setNombre_cientifico(request.getNombre_cientifico());
        especie.setTalla_mediterraneo(request.getTalla_mediterraneo());
        especie.setTalla_canario(request.getTalla_canario());
        especie.setTalla_cantabrico_nw_golfocadiz(request.getTalla_cantabrico_nw_golfocadiz());
        especie.setFoto_url(request.getFoto_url());
        especie.setDescripcion(request.getDescripcion());

        return especie;
    }

    public Boolean deleteEspeciesById(Long id){
        try {
            especiesRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}