package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.ModelShop;
import fpt.com.Product;

/**
 * contains GUI
 */
public class ViewShop extends BorderPane {
	

	private TextField tfName = new TextField();
	private TextField tfPrice = new TextField();
	private TextField tfCount = new TextField();

	private Button bAdd = new Button("Add");
	private Button bDelete = new Button("Delete");

	private Label lName = new Label("Name:");
	private Label lPreis = new Label("Price:");
	private Label lCount = new Label("Count:");

	ListView<fpt.com.Product> list = new ListView<>();

	private HBox hBRightBottom = new HBox();
	private VBox vBox = new VBox();
	private HBox hboxRechts = new HBox();

	public ViewShop() {

		hboxRechts.getChildren().addAll(vBox);

		vBox.getChildren().addAll(lName, tfName, lPreis, tfPrice, lCount, tfCount, hBRightBottom);

		hBRightBottom.getChildren().addAll(bAdd, bDelete);

		setRight(hboxRechts);
		setCenter(list);

		list.setCellFactory(e ->
		{
			ListCell<Product> cell = new ListCell<Product>() {
				@Override
				protected void updateItem(Product myObject, boolean b) {
					super.updateItem(myObject, myObject == null || b);
					if (myObject != null) {
						setText(myObject.getName() + " | " + myObject.getPrice() + " €  | " + myObject.getQuantity());
					} else {// wichtig da sonst der text stehen bleibt!
						setText("");
					}
				}
			};
			return cell;
		});
	}

	public void bindData(ModelShop m){
		list.setItems(m);
	}
	
	
	/**
	 * returns the listView
	 */
	public ListView<fpt.com.Product> getList() {
		
		return list;
	}

	public String getName() {
		return tfName.getText();
	}

	public Double getPrice() {
		return Double.parseDouble(tfPrice.getText());
	}

	public int getQuantity() {
		return Integer.parseInt(tfCount.getText());
	}

	public void addEventHandler(EventHandler<ActionEvent> eventHandler) {
		bAdd.addEventHandler(ActionEvent.ACTION, eventHandler);
		bDelete.addEventHandler(ActionEvent.ACTION, eventHandler);

	}

}
