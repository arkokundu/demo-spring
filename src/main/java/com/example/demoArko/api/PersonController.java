package com.example.demoArko.api;

import com.example.demoArko.model.Person;
import com.example.demoArko.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id){
        personService.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id, @RequestBody Person personToUpdate){
        personService.updatePerson(id, personToUpdate);
    }

    @PutMapping(path = "{id}/deposit/{amount}")
    public void depositAmount(@PathVariable("id") UUID id, @PathVariable("balance") int amount){
        personService.depositAmount(id, amount);
    }

    @PutMapping(path = "{id}/withdraw/{amount}")
    public void withdrawAmount(@PathVariable("id") UUID id, @PathVariable("balance") int amount){
        personService.withdrawAmount(id, amount);
    }
}
