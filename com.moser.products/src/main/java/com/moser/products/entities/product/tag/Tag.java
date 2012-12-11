/*
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.entities.product.tag;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.moser.products.entities.Datatype;

/**
 * Tag
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
@Entity
@Table(name = "tag")
public class Tag implements Datatype {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String tagName;

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
	 * @return the tagName
	 */
	@Column(name = "tagname")
	public String getTagName() {
		return this.tagName;
	}

	/**
	 * @param tagName
	 *            the tagName to set
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
