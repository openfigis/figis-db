package org.fao.fi.figis.dao;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.fao.fi.figis.domain.ref.FicItem;
import org.fao.fi.vme.dao.config.FigisDataBaseProducer;
import org.jglue.cdiunit.ActivatedAlternatives;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
@ActivatedAlternatives({ FigisDataBaseProducer.class })
public class FigisDaoTest {

	@Inject
	FigisDao figisDao;

	Class<?> entities[] = { FicItem.class };

	@Test
	public void testAll() throws InstantiationException, IllegalAccessException {
		for (Class<?> entity : entities) {
			delegateTestPersist(entity);
			delegateTestMerge(entity);
		}

	}

	@Test
	public void testLoadObjectsClassOfQ() {

	}

	@Test
	public void testFind() {

	}

	public void delegateTestMerge(Class<?> entity) throws InstantiationException, IllegalAccessException {
		assertEquals(0, figisDao.count(entity).intValue());
		Object o = entity.newInstance();
		figisDao.persist(o);
		figisDao.merge(o);
		assertEquals(1, figisDao.count(entity).intValue());
		figisDao.remove(o);

	}

	public void delegateTestPersist(Class<?> entity) throws InstantiationException, IllegalAccessException {
		assertEquals(0, figisDao.count(entity).intValue());
		Object o = entity.newInstance();
		figisDao.persist(o);
		assertEquals(1, figisDao.count(entity).intValue());
		figisDao.remove(o);

	}

	@Test
	public void testRemove() {

	}

}
