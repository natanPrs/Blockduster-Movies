package com.duster.Blockduster_Movies.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ativos> ativos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ReturnedFilm> returnedFilms;


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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Ativos> getActives() {
        return ativos;
    }

    public void setActives(List<Ativos> ativos) {
        this.ativos = ativos;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }


    public List<ReturnedFilm> getReturnedFilms() {
        return returnedFilms;
    }

    public void setReturnedFilms(List<ReturnedFilm> returnedFilms) {
        this.returnedFilms = returnedFilms;
    }
}
