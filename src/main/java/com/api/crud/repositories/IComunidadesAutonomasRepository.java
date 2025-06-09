package com.api.crud.repositories;

import com.api.crud.models.ComunidadesAutonomasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComunidadesAutonomasRepository extends JpaRepository<ComunidadesAutonomasModel, Long> {
}
