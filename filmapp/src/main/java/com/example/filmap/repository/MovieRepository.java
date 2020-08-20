package com.example.filmap.repository;

import com.example.filmap.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Query("SELECT m FROM Movie m WHERE lower(m.title) LIKE lower(concat('%',:title,'%'))")
    List<Movie> searchByTitle(@Param("title") String title);

    @Query("SELECT c.movie FROM Crew c WHERE c.role.id = 3 AND lower(c.person.name) LIKE lower(concat('%',:actor,'%'))")
    List<Movie> searchByActor(@Param("actor") String actor);

}
