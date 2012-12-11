/*
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.ejb.product;

import java.util.List;

import com.moser.products.ejb.SessionBean;
import com.moser.products.entities.product.Product;

/**
 * ProductSessionBean
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
public interface ProductSessionBean extends SessionBean {

	/**
	 * Loads the product with the given id.
	 * 
	 * @param id
	 *            the product id
	 * 
	 * @return the product
	 */
	Product loadProduct(long id);

	/**
	 * Loads all existing products.
	 * 
	 * @return the list of products
	 */
	List<Product> loadAllProducts();

	/**
	 * Persists the given product to the database.
	 * 
	 * @param product
	 *            the product to persist
	 */
	Product maintain(Product product);

}
