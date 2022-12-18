package com.doblel.interview.Interview.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HTTP requests are handled by a controller
 *
 * @RestController Version of controller @Controller and @ResponseBody Component class. Request handling methods
 * 					Means we are going to have endpoints available over the web
 * 			        Returns an Object instead of a view @Controller and @ResponseBody
 */
@RestController
public class GreetingController
{
    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * Get endpoint
     * RESTful: Populate and create a Greeting object
     * @param name used to get the name of the person
     * @return a new instance of the Greeting class
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}