/*
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.rest.impl;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.moser.products.ejb.product.ProductSessionBean;
import com.moser.products.entities.product.Product;
import com.moser.products.rest.api.ProductService;

/**
 * ProductServiceImpl
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
@Path("/product")
public class ProductServiceImpl implements ProductService {

	@Inject
	private ProductSessionBean productBean;

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAllProducts() {
		return this.productBean.loadAllProducts();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	@Override
	public Product getProduct(@PathParam("id") long id) {

		return this.productBean.loadProduct(id);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Product createProduct(Product product) {
		return this.productBean.maintain(product);
	}
}
