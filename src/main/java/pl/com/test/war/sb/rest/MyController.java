package pl.com.test.war.sb.rest;
/**
 * Copyright 2015-05-16 the original author or authors.
 */

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.test.war.sb.domain.Person;

/**
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@RestController
public class MyController {

    @RequestMapping("/rest/hello")
    public String hallo() {
        return "Hello world";
    }
    
    @RequestMapping("/rest/person/{id}")
    public Person loadPerson(@PathVariable("id") Integer id) {
        
        System.out.println("id = " + id);
        
        Person p = new Person();
        
        p.setLastName("Kowalski");
        p.setName("Jan");
        
        return p;
    }

}
