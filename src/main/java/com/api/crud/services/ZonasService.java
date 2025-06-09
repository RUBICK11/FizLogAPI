package com.api.crud.services;

import com.api.crud.models.ZonasModel;
import com.api.crud.repositories.IZonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ZonasService {

    @Autowired
    IZonasRepository zonasRepository;

    public ArrayList<ZonasModel> getZonas(){
        return (ArrayList<ZonasModel>) zonasRepository.findAll();
    }

    public ZonasModel saveZonas(ZonasModel zona){
        return zonasRepository.save(zona);
    }

    public Optional<ZonasModel> getZonasById(Long id){
        return zonasRepository.findById(id);
    }

    public ZonasModel updateZonasById(ZonasModel request, Long id){
        ZonasModel zona = zonasRepository.findById(id).get();

        zona.setTipo(request.getTipo());

        return zona;
    }

    public Boolean deleteZonasById(Long id){
        try {
            zonasRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
