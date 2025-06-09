package com.api.crud.services;

import com.api.crud.models.RecomendacionesEquipoModel;
import com.api.crud.repositories.IRecomendacionesEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RecomendacionesEquipoService {

    @Autowired
    IRecomendacionesEquipoRepository recomendacionesEquipoRepository;

    public ArrayList<RecomendacionesEquipoModel> getRecomendacionesEquipo(){
        return (ArrayList<RecomendacionesEquipoModel>) recomendacionesEquipoRepository.findAll();
    }

    public RecomendacionesEquipoModel saveRecomendacionesEquipo(RecomendacionesEquipoModel recomendacionEquipo){
        return recomendacionesEquipoRepository.save(recomendacionEquipo);
    }

    public Optional<RecomendacionesEquipoModel> getRecomendacionesEquipoById(Long id){
        return recomendacionesEquipoRepository.findById(id);
    }

    public RecomendacionesEquipoModel updateRecomendacionesEquipoById(RecomendacionesEquipoModel request, Long id){
        RecomendacionesEquipoModel recomendacionEquipo = recomendacionesEquipoRepository.findById(id).get();

        recomendacionEquipo.setTipoPesca(request.getTipoPesca());
        recomendacionEquipo.setUsuario(request.getUsuario());
        recomendacionEquipo.setTipo_cania(request.getTipo_cania());
        recomendacionEquipo.setTipo_cebo(request.getTipo_cebo());
        recomendacionEquipo.setTipo_carrete(request.getTipo_carrete());
        recomendacionEquipo.setTipo_sedal(request.getTipo_sedal());
        recomendacionEquipo.setDescripcion(request.getDescripcion());
        recomendacionEquipo.setLikes(request.getLikes());

        return recomendacionEquipo;
    }

    public Boolean deleteRecomendacionesEquipoById(Long id){
        try {
            recomendacionesEquipoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}