package com.example.academiacx;

import com.example.academiacx.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    List<Filme> findByTituloContaining(String titulo);
    List<Filme> findByGeneroId(Long generoId);

    List<Filme> findByEstudioId(Long estudioId);
}
