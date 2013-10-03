package org.fao.fi.figis.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;

import org.fao.fi.vme.dao.config.FigisDB;

/**
 * The dao in order to dconnect to the Figis database. Connection details to be
 * found in /figis-configuration/src/main/resources/META-INF/persistence.xml
 * 
 * 
 * 
 * 
 * @author Erik van Ingen
 * 
 */

@Singleton
public class FigisDao extends Dao {

	@Inject
	@FigisDB
	private EntityManager em;

	public List<?> loadObjects(Class<?> clazz) {
		return this.generateTypedQuery(em, clazz).getResultList();
	}

	public Object find(Class<?> clazz, Object id) {
		return em.find(clazz, id);
	}

	public void merge(Object object) {
		em.getTransaction().begin();
		em.merge(object);
		em.getTransaction().commit();
	}

	public void persist(Object object) {
		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
	}

	public void remove(Object object) {
		em.getTransaction().begin();
		em.remove(object);
		em.getTransaction().commit();
	}

}
