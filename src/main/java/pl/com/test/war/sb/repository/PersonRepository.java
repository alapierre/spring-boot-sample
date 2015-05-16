/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.test.war.sb.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pl.com.test.war.sb.domain.Person;

/**
 *
 * @author Administrator
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {
    
    public List<Person> findByNameLike(String name);
    
}
