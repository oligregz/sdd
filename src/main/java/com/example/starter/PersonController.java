package com.example.starter;

import com.example.starter.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @RequestMapping(value = "full-name", method = RequestMethod.GET, produces =MediaType.APPLICATION_JSON_VALUE)
    public Person getNamePerson() {
        var person = new Person();
        person.setName("Gregory");
        person.setLastName("Oliveira");

        return person;
    }
}
