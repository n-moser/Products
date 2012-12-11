/*
 * Copyright 2012 PRODYNA AG.
 */
package com.moser.products.cdi.producer;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * EntityManagerProducer
 * 
 * @author @author Nicolas Moser &lt;nicolas.moser@prodyna.de&gt;
 */
public class EntityManagerProducer {

	@Produces
	@PersistenceContext(unitName = "productsPu")
	private EntityManager entityManager;

}
