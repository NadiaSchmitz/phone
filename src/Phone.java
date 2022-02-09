
public class Phone {

	private long number;
	private double weight;
	private String model, name;
	
	public Phone() {
		
	}
	
	public Phone(long number, double weight, String model, String name) {
		this.number = number;
		this.weight = weight;
		this.model = model;
		this.name = name;
	}
	
	public Phone(long number, double weight, String model) {
		this(number, model);
		this.weight = weight;
	}
	
	public Phone(long number, String model) {
		this.number = number;
		this.model = model;
	}
	
	public long getNumber() {
		return number;
	}
	
	public void setNumber(long number) {
		this.number = number;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setNumber(String model) {
		this.model = model;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void receiveCall(long incoming_number) {
		if (this.number == incoming_number) {
			System.out.println("Nummer gehört zu dem Objekt: " + this.name);
		} else {
			System.out.println("Nummer gehört nicht zu diesem Objekt");
		}
	}
	
	public void receiveCall(long incoming_number, String name) {
		if (this.number == incoming_number) {
			System.out.println("Nummer gehört zu dem Objekt: " + this.name);
		} else {
			System.out.println("Nummer gehört nicht zu diesem Objekt");
		}
	}
	
}
