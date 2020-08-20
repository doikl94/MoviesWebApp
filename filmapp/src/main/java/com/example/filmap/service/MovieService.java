package com.example.filmap.service;

import com.example.filmap.models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    List<Movie> searchByTitle(String title);
    List<Movie> searchByActor(String actor);
}
