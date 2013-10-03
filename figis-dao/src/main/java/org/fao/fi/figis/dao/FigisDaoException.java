package org.fao.fi.figis.dao;

/**
 * Generic vme runtime exception. Vme so far does not have checked exceptions, the idea behind is that checked
 * exceptions create a lot of ugly boilerplate code, and more important, all code should be tested so that exception
 * will not occur runtime.
 * 
 * 
 * 
 * 
 * 
 * @author Erik van Ingen
 * 
 */
public class FigisDaoException extends RuntimeException {

	public FigisDaoException(Exception e) {
		super(e);
	}

	public FigisDaoException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1359907165992410885L;

}
