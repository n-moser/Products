/**
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.entities.product.category;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.moser.products.entities.Datatype;

/**
 * Category
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
@Entity
@Table(name = "category")
public class Category implements Datatype {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private List<CategoryProduct> productList;

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
	 * @return the name
	 */
	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the productList
	 */
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "category_id", nullable = true)
	public List<CategoryProduct> getProductList() {
		if (this.productList == null) {
			this.productList = new ArrayList<CategoryProduct>();
		}
		return this.productList;
	}

	/**
	 * @param productList
	 *            the productList to set
	 */
	void setProductList(List<CategoryProduct> productList) {
		this.productList = productList;
	}

}
