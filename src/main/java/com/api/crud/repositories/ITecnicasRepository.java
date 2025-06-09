package com.api.crud.repositories;

import com.api.crud.models.TecnicasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITecnicasRepository extends JpaRepository<TecnicasModel, Long> {
}
