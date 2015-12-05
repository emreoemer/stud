package main;

import controller.ControllerShop;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelShop;
import model.ProductList;
import view.ViewCustomer;
import view.ViewShop;

/**
 * contains main method to initialize program
 */
public class Main extends Application{
	
	public static void main(String[] args) {
		//launchs start (just java things)
		launch(args);

	}

	@Override
	public void start(Stage primaryStage){
		
		ViewShop view = new ViewShop();
		ViewCustomer viewC = new ViewCustomer();
		
		ProductList p = new ProductList();
		ModelShop model = new ModelShop(p);
		
		ControllerShop cs = new ControllerShop();
		
		cs.link(model, view);
		
		Scene s = new Scene(view);
		Scene s1 = new Scene(viewC);
		
		Stage stage = new Stage();
		stage.setScene(s1);
		
		primaryStage.setScene(s);
		primaryStage.show();
		stage.show();
	}

}