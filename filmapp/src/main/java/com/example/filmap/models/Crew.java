package com.example.filmap.models;

import javax.persistence.*;

@Entity
public class Crew {

    @EmbeddedId
    CrewKey id;

    @ManyToOne
    @MapsId("movie_id")
    @JoinColumn(name = "movie_id")
    Movie movie;

    @ManyToOne
    @MapsId("role_id")
    @JoinColumn(name = "role_id")
    Role role;

    @ManyToOne
    @MapsId("person_id")
    @JoinColumn(name = "person_id")
    Person person;

    public CrewKey getId() {
        return id;
    }

    public void setId(CrewKey id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
