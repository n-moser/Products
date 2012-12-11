/*
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.entities.product.category;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.moser.products.entities.Datatype;
import com.moser.products.entities.product.Product;

/**
 * CategoryProduct
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
@Entity
@Table(name = "categoryproduct")
public class CategoryProduct implements Datatype {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Product product;

	/**
	 * @return the id
	 */
	@Id
	@Override
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the product
	 */
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "product_id", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

}
