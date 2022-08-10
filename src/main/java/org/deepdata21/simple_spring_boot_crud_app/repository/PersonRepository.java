package org.deepdata21.simple_spring_boot_crud_app.repository;

import org.deepdata21.simple_spring_boot_crud_app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //@Component
public interface PersonRepository extends JpaRepository<Person, Long> {

}
