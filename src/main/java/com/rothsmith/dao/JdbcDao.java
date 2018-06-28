/*
 * Copyright (c) 2009 Rothsmith, LLC, All rights reserved.
 */
package com.rothsmith.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

/**
 * A JDBC based DAO interface definition. Added methods to handle JDBC specific
 * tasks such as DataSource and SQL statement accessors and mutators.
 * 
 * @param <T>
 *            DTO class.
 * @param <P>
 *            Parameter list.
 * 
 * @author drothauser
 */
public interface JdbcDao<T, P> extends GenericDao<T, P> {

	/**
	 * Method to execute a SQL query using the given parameters.
	 * 
	 * @param sql
	 *            SQL statement
	 * @param params
	 *            the parameter list
	 * @return {@link List} of DTOs
	 */
	List<T> select(String sql, P params);

	/**
	 * Method to execute a SQL query with no parameters.
	 * 
	 * @param sql
	 *            SQL statement
	 * @return {@link List} of DTOs
	 */
	List<T> select(String sql);

	/**
	 * Return DTO type.
	 * 
	 * @return DTO type
	 */
	Class<T> getType();

	/**
	 * Set DTO type. This is typically set initially in the constructor.
	 * 
	 * @param type
	 *            DTO type
	 */
	void setType(Class<T> type);

	/**
	 * Return DataSource.
	 * 
	 * @return DataSource
	 */
	DataSource getDataSource();

	/**
	 * Set DataSource and SimpleJDBCTemplate.
	 * 
	 * @param dataSource
	 *            DataSource
	 */
	void setDataSource(DataSource dataSource);

	/**
	 * Get statement map.
	 * 
	 * @return the Map
	 */
	Map<String, String> getStatementMap();

	/**
	 * Set statement map.
	 * 
	 * @param statementMap
	 *            the Map to set
	 */
	void setStatementMap(Map<String, String> statementMap);

	/**
	 * Method to execute a query based on the given key in a statement map with
	 * the given parameters.
	 * 
	 * @param statementId
	 *            key of the sql statement.
	 * @param params
	 *            the parameter list
	 * @return {@link List} of DTOs
	 */
	List<T> selectByStatement(String statementId, P params);

	/**
	 * Method to execute a query based on the given key in a statement map with
	 * no parameters.
	 * 
	 * @param statementId
	 *            key of the sql statement.
	 * @return {@link List} of DTOs
	 */
	List<T> selectByStatement(String statementId);

}
