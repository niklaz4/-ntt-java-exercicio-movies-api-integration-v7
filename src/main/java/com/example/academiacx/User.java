package com.example.academiacx;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;

    @OneToOne(mappedBy = "usuario")
    private EnderecoDTO endereco;
   @OneToMany
    private List<Role> roles;
   @OneToMany
   private List<Filme> favoriteMovies;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Filme> getFavoriteMovies() {
        return favoriteMovies;
    }

    public void setFavoriteMovies(List<Filme> favoriteMovies) {
        this.favoriteMovies = favoriteMovies;
    }


}
