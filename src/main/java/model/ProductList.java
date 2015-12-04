package model;

import java.util.ArrayList;
import fpt.com.Product;



@SuppressWarnings("serial")
public class ProductList extends ArrayList<Product> implements fpt.com.ProductList {
	// TODO variables ProductList
	
	@Override
	public boolean add(Product product) {
		return super.add(product);
	}
	@Override
	public boolean delete(fpt.com.Product product) {
		return super.remove(o);
	}
	@Override
	public int size() {
		return super.size();
	}

	@Override
	public Product findProductById(long id) {
		// TODO ProductList findById
		return null;
	}

	@Override
	public Product findProductByName(String name) {
		// TODO ProductList findByName
		return null;
	}

	



}
