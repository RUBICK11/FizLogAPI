package com.api.crud.services;

import com.api.crud.models.LikeModel;
import com.api.crud.models.LikeModel.LikeId;
import com.api.crud.repositories.ILikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    @Autowired
    private ILikeRepository likeRepository;

    public List<LikeModel> getAllLikes() {
        return likeRepository.findAll();
    }

    public Optional<LikeModel> getLikeById(LikeId id) {
        return likeRepository.findById(id);
    }

    public LikeModel saveLike(LikeModel like) {
        return likeRepository.save(like);
    }

    public boolean deleteLikeById(LikeId id) {
        if (likeRepository.existsById(id)) {
            likeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}