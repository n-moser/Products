/*
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.entities.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.moser.products.entities.Datatype;

/**
 * User
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
@Entity
@Table(name = "user")
public class User implements Datatype {

	private static final long serialVersionUID = 1L;

	private Long id;

	@Id
	@GeneratedValue
	@Override
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (this.id == null) {
			if (other.id != null)
				return false;
		} else if (!this.id.equals(other.id))
			return false;
		return true;
	}

}
