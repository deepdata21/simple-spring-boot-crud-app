package org.deepdata21.simple_spring_boot_crud_app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //@Component
@Table(name = "PERSON_TABLE") //  give custom name to the table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long license;

    private String firstName;
    private String lastName;
    private String email;
    private String cellPhone;
    private int age;

}
