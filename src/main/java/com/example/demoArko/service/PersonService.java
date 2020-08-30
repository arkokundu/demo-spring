package com.example.demoArko.service;

import com.example.demoArko.dao.PersonDao;
import com.example.demoArko.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDao personDao; //make sure you get the interface

    @Autowired
    public PersonService(@Qualifier("postgres") PersonDao personDao) {
        this.personDao = personDao;
    }



    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }

    public int deletePerson(UUID id){
        return  personDao.deletePersonId(id);
    }

    public int updatePerson(UUID id, Person newPerson){
        return personDao.updatePersonId(id,newPerson);
    }

    public String depositAmount(UUID id, int amount){
        Optional<Person> personOptional = personDao.selectPersonById(id);
        if (!personOptional.isEmpty()){
            Person person = personOptional.get();
            person = new Person(person.getId(),person.getName(),person.getBalance()+amount);
            personDao.insertPerson(person.getId(),person);
            return "";
        }
        return "Person doesn't exist with id .." + id.toString();
    }

    public String withdrawAmount(UUID id, int amount){
        Optional<Person> personOptional = personDao.selectPersonById(id);
        if (!personOptional.isEmpty()){
            Person person = personOptional.get();
            person = new Person(person.getId(),person.getName(),person.getBalance()-amount);
            if (person.getBalance() < 0)
                return "BALANCE TOO LOW!!";
            personDao.insertPerson(person.getId(),person);
            return "";
        }
        return "Person doesn't exist with id .." + id.toString();
    }


}
