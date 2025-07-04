package com.api.crud.repositories;

import com.api.crud.models.ZonasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IZonasRepository extends JpaRepository<ZonasModel, Long> {
}