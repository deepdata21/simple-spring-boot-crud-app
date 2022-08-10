package org.deepdata21.simple_spring_boot_crud_app.service;

import lombok.AllArgsConstructor;
import org.deepdata21.simple_spring_boot_crud_app.dto.PersonRequest;
import org.deepdata21.simple_spring_boot_crud_app.entity.Person;
import org.deepdata21.simple_spring_boot_crud_app.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImplementation implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person enterPerson (PersonRequest personRequest) {

        Person person = Person.builder()
                .firstName(personRequest.firstName())
                .lastName(personRequest.lastName())
                .email(personRequest.email())
                .cellPhone(personRequest.cellPhone())
                .age(personRequest.age())
                .build();

        return personRepository.saveAndFlush(person);
    }

    @Override
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @Override
    public Person getPerson(Long license) {
        return personRepository.findByLicense(license);
    }
}
