package com.example.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "film", schema = "app")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", columnDefinition = "smallint(5)")
    private Integer filmId;

    @Column(name = "title", columnDefinition = "varchar(255)")
    private String title;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return filmId.equals(film.filmId) && title.equals(film.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, title);
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                '}';
    }
}