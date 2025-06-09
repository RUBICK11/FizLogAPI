package com.api.crud.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Likes")
public class LikeModel {

    @EmbeddedId
    private LikeId id;

    @ManyToOne
    @MapsId("idUsuario")
    @JoinColumn(name = "idUsuario")
    private UsuariosModel idUsuario;

    @ManyToOne
    @MapsId("idRecomendacion")
    @JoinColumn(name = "idRecomendacion")
    private RecomendacionesEquipoModel idRecomendacion;

    // Constructor vacío
    public LikeModel() {}

    // Constructor completo
    public LikeModel(UsuariosModel usuario, RecomendacionesEquipoModel recomendacion) {
        this.idUsuario = usuario;
        this.idRecomendacion = recomendacion;
        this.id = new LikeId(usuario.getIdUsuario(), recomendacion.getId_recomendacion());
    }

    @Embeddable
    public static class LikeId implements Serializable {
        private Long idUsuario;
        private Long idRecomendacion;

        public LikeId() {}

        public LikeId(Long idusuario, Long idrecomendacion) {
            this.idUsuario = idusuario;
            this.idRecomendacion = idrecomendacion;
        }

        public Long getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(Long idusuario) {
            this.idUsuario = idusuario;
        }

        public Long getIdRecomendacion() {
            return idRecomendacion;
        }

        public void setIdRecomendacion(Long idrecomendacion) {
            this.idRecomendacion = idrecomendacion;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LikeId likeId = (LikeId) o;
            return Objects.equals(idUsuario, likeId.idUsuario) &&
                    Objects.equals(idRecomendacion, likeId.idRecomendacion);
        }

        @Override
        public int hashCode() {
            return Objects.hash(idUsuario, idRecomendacion);
        }

    }

    public LikeId getId() {
        return id;
    }

    public void setId(LikeId id) {
        this.id = id;
    }

    public UsuariosModel getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuariosModel idUsuario) {
        this.idUsuario = idUsuario;
    }

    public RecomendacionesEquipoModel getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(RecomendacionesEquipoModel idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }
}