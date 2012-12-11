/*
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.rest.api;

import java.util.List;

import com.moser.products.entities.product.Product;

/**
 * ProductService
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
public interface ProductService {

	/**
	 * Load a product for the given id.
	 * 
	 * @param id
	 *            the product id
	 * 
	 * @return the product
	 */
	List<Product> getAllProducts();

	/**
	 * Load a product for the given id.
	 * 
	 * @param id
	 *            the product id
	 * 
	 * @return the product
	 */
	Product getProduct(long id);

}
