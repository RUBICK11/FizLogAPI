package com.api.crud.repositories;

import com.api.crud.models.EspeciesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEspeciesRepository extends JpaRepository<EspeciesModel, Long> {
}
