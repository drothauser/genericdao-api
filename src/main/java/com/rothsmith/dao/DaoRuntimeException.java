/*
 * (c) 2015 Rothsmith, LLC All Rights Reserved.
 */
package com.rothsmith.dao;

/**
 * @author drothauser
 *
 */
public class DaoRuntimeException
        extends RuntimeException {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 6287532781915526165L;

	/**
	 * @param message
	 *            error message
	 */
	public DaoRuntimeException(String message) {
		super(message);
	}

	/**
	 * @param message
	 *            error message
	 * @param cause
	 *            {@link Throwable} instance.
	 */
	public DaoRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

}
