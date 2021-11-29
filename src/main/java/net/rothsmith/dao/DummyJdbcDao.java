/*
 * (c) 2014 Rothsmith, LLC All Rights Reserved.
 */
package net.rothsmith.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

/**
 * @author drothauser
 * @param <T>
 *            DTO class.
 * @param <P>
 *            Parameter list.
 *
 */
public class DummyJdbcDao<T, P> implements JdbcDao<T, P> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<T> select(P params) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insert(T dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int update(T dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delete(T dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<T> select(String sql, P params) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<T> select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Class<T> getType() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setType(Class<T> type) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, String> getStatementMap() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStatementMap(Map<String, String> statementMap) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<T> selectByStatement(String statementId, P params) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<T> selectByStatement(String statementId) {
		// TODO Auto-generated method stub
		return null;
	}

}
