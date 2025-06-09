package com.api.crud.services;

import com.api.crud.models.PuntosPescaModel;
import com.api.crud.repositories.IPuntosPescaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PuntosPescaService {

    @Autowired
    IPuntosPescaRepository puntosPescaRepository;

    public ArrayList<PuntosPescaModel> getPuntosPesca(){
        return (ArrayList<PuntosPescaModel>) puntosPescaRepository.findAll();
    }

    public PuntosPescaModel savePuntosPesca(PuntosPescaModel puntoPesca){
        return puntosPescaRepository.save(puntoPesca);
    }

    public Optional<PuntosPescaModel> getPuntosPescaById(Long id){
        return puntosPescaRepository.findById(id);
    }

    public PuntosPescaModel updatePuntosPescaById(PuntosPescaModel request, Long id){
        PuntosPescaModel puntoPesca = puntosPescaRepository.findById(id).get();

        puntoPesca.setUsuario(request.getUsuario());
        puntoPesca.setZona(request.getZona());
        puntoPesca.setComunidadAutonoma(request.getComunidadAutonoma());
        puntoPesca.setLatitud(request.getLatitud());
        puntoPesca.setLongitud(request.getLongitud());
        puntoPesca.setDescripcion(request.getDescripcion());
        puntoPesca.setFechaGuardado(request.getFechaGuardado());
        puntoPesca.setFechaGuardado(request.getFechaGuardado());
        puntoPesca.setNombrePoblacion(request.getNombrePoblacion());

        return puntoPesca;
    }

    public Boolean deletePuntosPescaById(Long id){
        try {
            puntosPescaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
