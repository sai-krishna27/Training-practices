package com.daoCrud;

import java.sql.SQLException;
import java.util.List;

import com.pojo.Product;

public interface ProductCrudInterface {
	
	//this method is used to add a product
	public int addProduct(Product product) throws ClassNotFoundException, SQLException;
	//this method is used to delete a product
	public int deleteProduct(int id) throws ClassNotFoundException, SQLException;
	//this method is used to select the list of products 
	public List<Product> selectProducts() throws ClassNotFoundException, SQLException;
	//update product name
	public int updateProductName(int id, String name) throws ClassNotFoundException, SQLException;
}
