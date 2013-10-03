package org.fao.fi.figis.dao;

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

}
