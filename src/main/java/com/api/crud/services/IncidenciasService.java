package com.api.crud.services;

import com.api.crud.models.IncidenciasModel;
import com.api.crud.repositories.IIncidenciasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class IncidenciasService {

    @Autowired
    IIncidenciasRepository incidenciasRepository;

    public ArrayList<IncidenciasModel> getincidencias(){
        return (ArrayList<IncidenciasModel>) incidenciasRepository.findAll();
    }

    public IncidenciasModel saveIncidencia(IncidenciasModel incidencia){
        return incidenciasRepository.save(incidencia);
    }

    public Optional<IncidenciasModel> getIncidenciasById(Long id){
        return incidenciasRepository.findById(id);
    }

    public IncidenciasModel updateIncidenciasById(IncidenciasModel request, Long id){
        IncidenciasModel incidencia = incidenciasRepository.findById(id).get();

        incidencia.setUsuario(request.getUsuario());
        incidencia.setTitulo(request.getTitulo());
        incidencia.setDescirpcion(request.getDescirpcion());
        incidencia.setFechaHora(request.getFechaHora());
        incidencia.setResuelto(request.getResuelto());

        return incidencia;
    }

    public Boolean deleteIncidenciasById(Long id){
        try {
            incidenciasRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}