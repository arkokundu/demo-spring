package com.example.demoArko.dao;

import com.example.demoArko.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao{

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public int deletePersonId(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonId(UUID id, Person person) {
        return 0;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(),"FROM POSTGRES DB"));
    }
}
