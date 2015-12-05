package view;



import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class ViewCustomer extends BorderPane{
	
	private Button bBuy = new Button("Buy");
	
	private TableView<String> list = new TableView();
	
	TableColumn ColName = new TableColumn("Name");
    TableColumn ColPrice = new TableColumn("Price");
    TableColumn ColBuyCount = new TableColumn("Buy Count");
    
    
    
    @SuppressWarnings("unchecked")
	public ViewCustomer(){
    	list.getColumns().addAll(ColName, ColPrice, ColBuyCount);
    	
    	setCenter(list);
    }
    
   
    
	
	

}
