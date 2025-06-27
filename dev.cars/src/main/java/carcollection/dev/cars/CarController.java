package carcollection.dev.cars;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	//List of cars_ this is memory
	ArrayList<car> Cars = 
	new ArrayList<>(Arrays.asList(
			new car(0, "Toyota", 200, "sedan"),
			new car(1, "Lexus", 400, "SUV"),
			new car(2, "BMW", 800, "Convertible")));
	
	//This is handling GET requests
	@GetMapping
	public ArrayList<car> getAllCars() {
		return Cars;
	}
	
	// Adding a new car
	@PostMapping
	public car addCar(@RequestBody car newCar) {
		Cars.add(newCar);
		return newCar;
	}
	
}