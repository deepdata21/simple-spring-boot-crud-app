package org.deepdata21.simple_spring_boot_crud_app.controller;

import org.deepdata21.simple_spring_boot_crud_app.dto.PersonRequest;
import org.deepdata21.simple_spring_boot_crud_app.entity.Person;
import org.deepdata21.simple_spring_boot_crud_app.repository.PersonRepository;
import org.deepdata21.simple_spring_boot_crud_app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController //@Component
@RequestMapping("/api/v1/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/enroll")
    public ResponseEntity<Person> enterPerson(
            @RequestBody @Valid PersonRequest personRequest){
        return new ResponseEntity<>(personService
                .enterPerson(personRequest), HttpStatus.CREATED);
    }

    @GetMapping("/allEntries")
    public ResponseEntity<List<Person>> getAllPeople() {
        return ResponseEntity.ok(personService.getAllPeople());
    }

    @GetMapping("/{license}")
    public ResponseEntity<Person> getPerson(@PathVariable Long license) {
        return ResponseEntity.ok(personService.getPerson(license));
    }

}
