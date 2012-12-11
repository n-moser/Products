/**
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.entities.product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.moser.products.entities.Datatype;
import com.moser.products.entities.product.tag.Tag;

/**
 * Product
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
@Entity
@Table(name = "product")
public class Product implements Datatype {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private List<Tag> tagList;

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
	 * @return the tagList
	 */
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id", nullable = true)
	public List<Tag> getTagList() {
		if (this.tagList == null) {
			this.tagList = new ArrayList<Tag>();
		}
		return this.tagList;
	}

	/**
	 * @param tagList
	 *            the tagList to set
	 */
	void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}

}
