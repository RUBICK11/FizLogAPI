package com.api.crud.repositories;

import com.api.crud.models.PuntosPescaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPuntosPescaRepository extends JpaRepository<PuntosPescaModel, Long> {
}
