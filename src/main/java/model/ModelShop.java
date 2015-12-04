package model;


import javafx.collections.ModifiableObservableListBase;
import javafx.collections.ObservableList;
import fpt.com.Product;

@SuppressWarnings("serial")
public class ModelShop extends ModifiableObservableListBase<Product> implements fpt.com.ProductList{
	
	private ProductList productList;
	
	/*public ObservableList<fpt.com.Product> getStrings(){
		return this;
	}*/
	
	public ModelShop(ProductList productList){
		this.productList = productList;
	}

	
	@Override
	protected void doAdd(int arg0, Product product) {
		productList.add(product);
	}


	@Override
	protected Product doSet(int index, Product element) {
		return productList.set(index, element);
	}


	@Override
	protected Product doRemove(int index) {
		return productList.remove(index);
	}

	@Override
	public Product findProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product get(int index) {
		return productList.get(index);
	}


	@Override
	public int size() {
		return productList.size();
	}


	@Override
	public boolean delete(Product product) {
		return remove(product);
	}
	
	public void addString(Product p) {
		this.add(p);
	}
	
	public ProductList getList(){
		return productList;
	}
	
	
}
