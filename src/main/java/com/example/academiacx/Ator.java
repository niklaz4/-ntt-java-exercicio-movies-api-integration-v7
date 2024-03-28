package com.example.academiacx;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="ator")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "ator")
    private List<Filme> movies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Filme> getMovies() {
        return movies;
    }

    public void setMovies(List<Filme> movies) {
        this.movies = movies;
    }
}
