package in.ac.sharda.pizzaapplication.domain;

public class Product {
	
	private int calories;
	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}
	public Product(int id) {
		this.id = id;
	}

	private final int id;
	public int getId() {
		return id;
	}
	
	
	public int getPrice() {
		return price;
	}
	public Product(int id, int price, String name, String description) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	private int price;
	private String name,description;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Product)
			return ((Product)obj).getId()==id;
		
		return false;
	}
	

}
