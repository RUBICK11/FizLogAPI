package com.api.crud.controlers;

import com.api.crud.models.LikeModel;
import com.api.crud.models.LikeModel.LikeId;
import com.api.crud.services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/likes")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @GetMapping
    public List<LikeModel> getAllLikes() {
        return likeService.getAllLikes();
    }

    @GetMapping("/{idusuario}/{idrecomendacion}")
    public ResponseEntity<LikeModel> getLikeById(@PathVariable Long idUsuario, @PathVariable Long idRecomendacion) {
        LikeId id = new LikeId(idUsuario, idRecomendacion);
        Optional<LikeModel> like = likeService.getLikeById(id);
        return like.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public LikeModel createLike(@RequestBody LikeModel like) {
        return likeService.saveLike(like);
    }

    @DeleteMapping("/{idusuario}/{idrecomendacion}")
    public ResponseEntity<Void> deleteLike(@PathVariable Long idUsuario, @PathVariable Long idRecomendacion) {
        LikeId id = new LikeId(idUsuario, idRecomendacion);
        Optional<LikeModel> like = likeService.getLikeById(id);
        if (like.isPresent()) {
            likeService.deleteLikeById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}