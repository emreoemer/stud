package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import model.ModelShop;
import model.Product;
import view.ViewShop;

public class ControllerShop implements EventHandler<ActionEvent>{
	
	private ModelShop model;
	private ViewShop view;
	
	public void link(ModelShop model, ViewShop view){
		this.model = model;
		this.view = view;
		this.view.bindData(this.model);
		view.getList().setItems(model);
		view.addEventHandler(this);
	}
	
	@Override
	public void handle(ActionEvent event) {
		switch (((Button)event.getSource()).getText()) {
		case "Add":
			String name = view.getName();
			double price = view.getPrice();
			int quantity = view.getQuantity();
			model.add(new Product(name,price,quantity));
			break;

		case "Delete":
			model.delete(view.getList().getSelectionModel().getSelectedItem());
			break;
		}
		
		
	}

}
