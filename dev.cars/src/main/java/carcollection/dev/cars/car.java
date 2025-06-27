package carcollection.dev.cars;

public class car {
	private int id;
	private String name;
	private int price;
	private String type;
	
	//Loaded constructor
	public car(int id,String name,int price,String type){
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	//Default constructor
	public car() {};
	
	//Getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setType(String type) {
		this.type = type;
	
	}

	public void setId(int id) {
		this.id = id;
	}
}


