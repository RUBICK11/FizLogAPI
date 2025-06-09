package com.api.crud.repositories;

import com.api.crud.models.PermisosUsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPermisosUsuariosRepository extends JpaRepository<PermisosUsuariosModel, Long> {
}
