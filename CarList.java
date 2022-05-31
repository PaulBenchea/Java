package Lab2;
import java.util.*;
import java.util.stream.Collectors;

public class CarList{
	public static void main(Strings []args){
		ArrayList<Car> car_list = new ArrayList<Car>();
		car_list.add(Car("Audi", "RS 3", 285, 50900, 2021));
		car_list.add(Car("BMW", "i4", 312, 51905, 2020));
		car_list.add(Car("bMW", "iX", 295, 94905, 2022));
	}
	
	Car c = Collections.min(car_list);
}