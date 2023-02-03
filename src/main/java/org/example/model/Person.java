package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phone_id",referencedColumnName = "phone_id")
    private Phone phone;

    public Person() {

    }

    public Person(String name, int age, String email,Phone phone1) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone1;
    }
}