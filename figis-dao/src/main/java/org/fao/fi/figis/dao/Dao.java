package org.fao.fi.figis.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public abstract class Dao {

	protected TypedQuery<?> generateTypedQuery(Class<?> clazz) {
		String queryString = " select o from  " + clazz.getCanonicalName() + " o ";
		return generateTypedQuery(clazz, queryString);
	}

	protected List<?> selectFrom(EntityManager em, Class<?> clazz) {
		return this.generateTypedQuery(clazz).getResultList();
	}

	protected List<?> loadObjects(Class<?> clazz) {
		return this.generateTypedQuery(clazz).getResultList();
	}

	protected TypedQuery<?> generateTypedQuery(Class<?> clazz, String queryString) {
		TypedQuery<?> query = getEntityManager().createQuery(queryString, clazz);
		return query;
	}

	protected Long count(Class<?> clazz) {
		String queryString = " select count(o) from  " + clazz.getCanonicalName() + " o ";
		Query query = getEntityManager().createQuery(queryString);
		return (Long) query.getSingleResult();
	}

	abstract EntityManager getEntityManager();

}
