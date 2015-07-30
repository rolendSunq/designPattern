package observer.part1;

import java.util.ArrayList;

public class Product implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String productName;
	private String productType;
	String availability;

	public Product(String productName, String productType, String availability) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability = availability;
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		System.out.println("제품을 사용할 수 있을 때 모든 사용자에게 통보.");
		for (Observer ob : observers) {
			ob.update(this.availability);
		}

	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

}
