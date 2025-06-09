package com.api.crud.repositories;

import com.api.crud.models.LikeModel;
import com.api.crud.models.LikeModel.LikeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILikeRepository extends JpaRepository<LikeModel, LikeId> {
}