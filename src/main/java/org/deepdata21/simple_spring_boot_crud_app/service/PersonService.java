package org.deepdata21.simple_spring_boot_crud_app.service;

import org.deepdata21.simple_spring_boot_crud_app.dto.PersonRequest;
import org.deepdata21.simple_spring_boot_crud_app.entity.Person;
import org.deepdata21.simple_spring_boot_crud_app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    //@Component
public interface PersonService {

    Person enterPerson(PersonRequest personRequest);

    List<Person> getAllPeople();

    Person getPerson(Long license);



}
