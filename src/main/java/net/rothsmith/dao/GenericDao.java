/*
 * Copyright (c) 2009 Rothsmith, LLC, All rights reserved.
 */
package net.rothsmith.dao;

import java.util.List;

/**
 * A generic DAO interface definition. Even though SQL type nomenclature is used
 * (select, insert, etc.) this can be used for any type of data store, not just
 * RDBMS type systems.
 * 
 * 
 * @param <T>
 *            DTO class.
 * @param <P>
 *            Parameter list.
 * 
 * @author drothauser
 */
public interface GenericDao<T, P> {

	/**
	 * Return a list of DTOs using testParams to populate criteria.
	 * 
	 * @param params
	 *            the parameter list
	 * 
	 * @return List of DTOs
	 */
	List<T> select(P params);

	/**
	 * Persist DTO.
	 * 
	 * @param dto
	 *            the DTO to persist.
	 * @return Records affected
	 */
	int insert(T dto);

	/**
	 * Update DTO.
	 * 
	 * @param dto
	 *            the DTO to update.
	 * @return Records affected
	 */
	int update(T dto);

	/**
	 * Delete based on testParams to populate criteria.
	 * 
	 * @param dto
	 *            the DTO to update.
	 * @return Records affected
	 */
	int delete(T dto);
}
