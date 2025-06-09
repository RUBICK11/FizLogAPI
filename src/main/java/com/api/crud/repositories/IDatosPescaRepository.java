package com.api.crud.repositories;

import com.api.crud.models.DatosPescaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDatosPescaRepository extends JpaRepository<DatosPescaModel, Long> {
}