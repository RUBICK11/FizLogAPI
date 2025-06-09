package com.api.crud.repositories;

import com.api.crud.models.NormativaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INormativaRepository extends JpaRepository<NormativaModel, Long> {
}