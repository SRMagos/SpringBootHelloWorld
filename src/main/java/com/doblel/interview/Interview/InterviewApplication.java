package com.doblel.interview.Interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * We don't have XML
 * @SpringBootApplication used to EnableAutoConfiguration ComponentScan Configuration
 * 							@Configuration: Definitions of beans
 * @RestController Version of controller @Controller and @ResponseBody Component class. Request handling methods
 *  				Means we are going to have endpoints available over the web
 *  			    Returns an Object instead of a view @Controller and @ResponseBody
 */
@SpringBootApplication
@RestController
public class InterviewApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(InterviewApplication.class, args);
	}

	/**
	 * http://localhost:8080/hello?name=DobleL
	 * Hello DobleL
	 * http://localhost:8080/greeting?name=DobleL
	 *
	 * @GetMapping("/hello") Request Get Type
	 * @RequestParam To configure parameters
	 * 					value: this value should be in the query
	 * 					defaultValue: If we don't pass the param value, it is going to have a value "World"
	 * @param name param in the query
	 * @return String with the response
	 */
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name)
	{
		return String.format("Hello %s!", name);
	}
}
