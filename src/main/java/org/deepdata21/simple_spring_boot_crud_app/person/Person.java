package org.deepdata21.simple_spring_boot_crud_app.person;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity //@Component
@Table(name = "person") //  give custom name to the table
@Getter //  from Lombok
@Setter //  from Lombok
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long license;

    private String firstName;
    private String lastName;
    private int age;

}
