package org.fao.fi.figis.dao;

import org.fao.fi.figis.domain.ref.FicItem;
import org.fao.fi.vme.dao.config.FigisDataBaseProducer;
import org.jglue.cdiunit.ActivatedAlternatives;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
@ActivatedAlternatives({ FigisDataBaseProducer.class })
public class FigisDaoTest {

	Class<?> entities[] = { FicItem.class };

	@Test
	public void testLoadObjectsClassOfQ() {

	}

	@Test
	public void testFind() {

	}

	@Test
	public void testMerge() {

	}

	@Test
	public void testPersist() {

	}

	@Test
	public void testRemove() {

	}

}
