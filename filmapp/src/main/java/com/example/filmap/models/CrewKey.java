package com.example.filmap.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CrewKey implements Serializable {

    @Column(name = "movie_id")
    Integer movieId;

    @Column(name = "role_id")
    Integer roleId;

    @Column(name = "person_id")
    Integer personId;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrewKey crewKey = (CrewKey) o;
        return Objects.equals(movieId, crewKey.movieId) &&
                Objects.equals(roleId, crewKey.roleId) &&
                Objects.equals(personId, crewKey.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, roleId, personId);
    }
}
