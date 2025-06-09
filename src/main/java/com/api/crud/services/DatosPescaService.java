package com.api.crud.services;

import com.api.crud.models.DatosPescaModel;
import com.api.crud.repositories.IDatosPescaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DatosPescaService {

    @Autowired
    IDatosPescaRepository datosPescaRepository;

    public ArrayList<DatosPescaModel> getDatosPesca() {
        return (ArrayList<DatosPescaModel>) datosPescaRepository.findAll();
    }

    public DatosPescaModel saveDatosPesca(DatosPescaModel datoPesca){
        return datosPescaRepository.save(datoPesca);
    }

    public Optional<DatosPescaModel> getDatosPescaById(Long id){
        return datosPescaRepository.findById(id);
    }

    public DatosPescaModel updateDatosPescaById(DatosPescaModel request, Long id){
        DatosPescaModel datoPesca = datosPescaRepository.findById(id).get();

        datoPesca.setUsuario(request.getUsuario());
        datoPesca.setEspecie(request.getEspecie());
        datoPesca.setUbiacion(request.getUbiacion());
        datoPesca.setTamanio(request.getTamanio());
        datoPesca.setPeso(request.getPeso());
        datoPesca.setSeHaSoltado(request.getSeHaSoltado());
        datoPesca.setMar(request.getMar());
        datoPesca.setSuperaTallaMinima(request.getSuperaTallaMinima());
        datoPesca.setPresionAtmosferica(request.getPresionAtmosferica());
        datoPesca.setTemporal(request.getTemporal());
        datoPesca.setCoeficiente(request.getCoeficiente());
        datoPesca.setMarea(request.getMarea());
        datoPesca.setCeboSeniuelo(request.getCeboSeniuelo());
        datoPesca.setFechaHora(request.getFechaHora());

        return datoPesca;
    }

    public Boolean deleteDatosPescaById(Long id){
        try {
            datosPescaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}