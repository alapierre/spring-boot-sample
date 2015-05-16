package pl.com.test.war.sb.rest;
/**
 * Copyright 2015-05-16 the original author or authors.
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.test.war.sb.domain.Person;
import pl.com.test.war.sb.repository.PersonRepository;

/**
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@RestController
public class MyController {

    @Autowired
    private PersonRepository personRepository;
    
    @RequestMapping("/rest/hello")
    public String hallo() {
        return "Hello world";
    }
    
    @RequestMapping("/rest/test")
    String createTestPerson() {
        
        Person p = new Person();
        
        p.setLastName("Kowalski");
        p.setName("Jan");
        
        personRepository.save(p);
        
        return "OK";
    }
    
    @RequestMapping("/rest/person/{id}")
    public Person loadPerson(@PathVariable("id") Integer id) {
        
        System.out.println("id = " + id);
        
        return personRepository.findOne(id);
    }
    
    @RequestMapping("/rest/person/name/{name}")
    public List<Person> findPersonByName(@PathVariable String name) {
        return personRepository.findByNameLike(name);
    }
    
    
    @RequestMapping(value = "/rest/save", method = RequestMethod.POST)
    public Person save(@RequestBody Person person) {
        
        personRepository.save(person);
        
        return person;
    }
}
