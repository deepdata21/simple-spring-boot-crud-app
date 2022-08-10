package org.deepdata21.simple_spring_boot_crud_app.controller;

import org.deepdata21.simple_spring_boot_crud_app.entity.Person;
import org.deepdata21.simple_spring_boot_crud_app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //@Component
@RequestMapping("/api/v1/people")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllFirstNames() {
        System.out.println("List all first names:");
        System.out.println();
        return personRepository.findAll();
    }

}
