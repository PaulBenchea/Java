import java.util.*;
import java.util.stream.Collectors;

import models.*;
import repository.*;

public class TestMain{
	public static void main(String []args){
		//Create repository
		CarRepository car_list = new CarRepository();
		//Add cars to repository
		car_list.add(new Car(1, "Logan", 40, "Dacia", 1999));
		car_list.add(new Car(2, "Sandero", 140, "Dacia", 2020));
		//Print all cars
		for(Car elem: car_list.findAll()) {
			System.out.println(elem);
		}
		//Find a car by id
		Car car = car_list.findByID(2);
		System.out.println("Car 2:" + car);
		//Delete a car
		car_list.delete(car);
		for(Car elem: car_list.findAll()) {
			System.out.println(elem);
		}
}
