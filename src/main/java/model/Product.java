package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

@SuppressWarnings("serial")
public class Product implements fpt.com.Product{
	private SimpleStringProperty name = new SimpleStringProperty();
	private long id;
	private SimpleDoubleProperty price = new SimpleDoubleProperty();
	private SimpleIntegerProperty quantity = new SimpleIntegerProperty();
	

	public Product(String name, double price, int quantity) {
		this.name.set(name);
		this.price.setValue(price);
		this.quantity.setValue(quantity);
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;		
	}

	@Override
	public double getPrice() {
		return price.get();
	}

	@Override
	public void setPrice(double price) {
		this.price.set(price);
		
	}

	@Override
	public int getQuantity() {
		return quantity.get();
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity.set(quantity);
		
	}

	@Override
	public String getName() {
		return name.get();
	}

	@Override
	public void setName(String name) {
		this.name.set(name);
		
	}

	@Override
	public ObservableValue<String> nameProperty() {
		return name;
	}

	@Override
	public ObservableValue<Number> priceProperty() {
		return price;
	}

	@Override
	public ObservableValue<Number> quantityProperty() {
		return quantity;
	}
}
