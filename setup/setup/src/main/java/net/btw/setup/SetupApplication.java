package net.btw.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetupApplication.class, args);
	}

}

// Let us go ahead and setup our controller here. We could set this up within another file in another package, as that is the better way to do it, but here we will
// do it this way for now.
// This will be a rest controller

@RestController
class MyController {

	// We want to go ahead and setup our mapping as well for our api, and return a simple string.
	// We can actually start our browser up here and navigate to this and we will already have an endpoint setup, as this is really all we need.
	// We start this up in our terminal with the maven command ./mvnw spring-boot:run
	@GetMapping("/api/greeting")
	public String offerGreeting() {
		return "Why hello there.";
	}
	// Within postman or the site itself, navigate to localhost:8080/actuator to see the different health checks that we have. The root actuator tells us
	// which actuators we have available.
}