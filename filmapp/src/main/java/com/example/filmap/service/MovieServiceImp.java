package com.example.filmap.service;

import com.example.filmap.models.Movie;
import com.example.filmap.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> searchByTitle(String title) {
        return movieRepository.searchByTitle(title);
    }

    @Override
    public List<Movie> searchByActor(String actor) {
        return movieRepository.searchByActor(actor);
    }
}
