package com.api.crud.repositories;

import com.api.crud.models.IncidenciasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIncidenciasRepository extends JpaRepository<IncidenciasModel, Long> {
}