package com.example.demoArko.dao;

import com.example.demoArko.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    //Define operations allowed and the contract

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);

    }

    int deletePersonId(UUID id);

    int updatePersonId(UUID id, Person person);

    Optional<Person> selectPersonById(UUID id);

    List<Person> selectAllPeople();
}
