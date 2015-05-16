package pl.com.test.war.sb.rest;
/**
 * Copyright 2015-05-16 the original author or authors.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@RestController
public class MyController {

    @RequestMapping("/rest/hello")
    public String hallo() {
        return "Hello world";
    }

}
