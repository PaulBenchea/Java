package Lab2;
class Car implements Comparable<Car>{
	private String manufacturer;
	private String model;
	private int maximum_speed;
	private int price;
	private int manufacturing_year;
	
	public Car(String manufacturer, String model, int maximum_speed, int price, int manufacturing_year){
		this.manufacturer = manufacturer;
		this.model = model;
		this.maximum_speed = maximum_speed;
		this.price = price;
		this.manufacturing_year = manufacturing_year;
	}
	
	public Car(){
		this.manufacturer = "";
		this.model = "";
		this.maximum_speed = 0;
		this.price = 0;
		this.manufacturing_year = 0;
	}
	
	public String get_manufacturer()
	{
		return manufacturer;
	}
	public void set_manufacturer(String manufacturer)
	{
			this.manufacturer = manufacturer;
	}
	public String get_model()
	{
		return model;
	}
	public void set_model(String model)
	{
			this.model = model;
	}
	public int get_maximum_speed()
	{
		return maximum_speed;
	}
	public void set_maximum_speed(int maximum_speed)
	{
			this.maximum_speed = maximum_speed;
	}
	public int get_price()
	{
		return price;
	}
	public void set_price(int price)
	{
			this.price = price;
	}
	public int get_manufacturing_year()
	{
		return this.manufacturing_year;
	}
	public void set_manufacturing_year(int manufacturing_year)
	{
			this.manufacturing_year = manufacturing_year;
	}
	
	@Override
	public String toString(){
		String s = " ";
		s+=this.manufacturer;
		s+=" model: ";
		s+=this.model;
		s+=" speed: ";
		s+=this.maximum_speed;
		s+=" price: ";
		s+=this.price;
		s+="$ manufacturing year: ";
		s+=this.manufacturing_year;
		return s;
	}
	
	public int compareTo(Car car){
		if(car.price > this.price)
			return -1;
		else if(car.price == this.price)
			return 0;
		else return 1;
	}
}