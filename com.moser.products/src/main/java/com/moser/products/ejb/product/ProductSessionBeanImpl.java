/*
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.ejb.product;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.moser.products.entities.product.Product;

/**
 * ProductSessionBeanImpl
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
@Stateless
public class ProductSessionBeanImpl implements ProductSessionBeanLocal,
		ProductSessionBeanRemote {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager entityManager;

	@Override
	public Product loadProduct(long id) {

		Product product = this.entityManager.find(Product.class, id);
		return product;
	}

	@Override
	public List<Product> loadAllProducts() {

		TypedQuery<Product> query = this.entityManager.createQuery(
				"select p from Product p", Product.class);

		return query.getResultList();
	}

	@Override
	public Product maintain(Product product) {

		this.entityManager.persist(product);

		return product;
	}

}
