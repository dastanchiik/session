package org.example;
import org.example.model.Person;
import org.example.model.Phone;
import org.example.repository.PersonImpl;
import org.example.repository.PhoneImpl;

public class App {
    public static void main(String[] args) {
        Phone phone = new Phone("Redmin note 8+ pro max mega ucra",45);
        Person person = new Person("Elmirdev",15,"elmir@gmail.com",phone);
        PersonImpl person1 = new PersonImpl();
        PhoneImpl phone1 = new PhoneImpl();
        person1.save(person);
    }
}
