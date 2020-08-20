package com.example.filmap.service;

import com.example.filmap.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    PersonService personService;

    @Override
    public List<Person> findAll() {
        return personService.findAll();
    }
}
