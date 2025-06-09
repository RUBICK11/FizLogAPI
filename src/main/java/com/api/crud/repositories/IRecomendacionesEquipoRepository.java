package com.api.crud.repositories;

import com.api.crud.models.RecomendacionesEquipoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecomendacionesEquipoRepository extends JpaRepository<RecomendacionesEquipoModel, Long> {
}
