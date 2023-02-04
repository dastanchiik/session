package org.example;import org.example.repository.PersonImpl;public class App { public static void main(String[] args) {PersonImpl person1 = new PersonImpl();System.out.println(person1.getById(4L));
    }
}