package com.pmq.mybatis.sqlsource;

import java.util.List;

public class StaticSqlSource implements SqlSource {

	private String sql;

	private List<ParameterMapping> parameterMappings;

	public StaticSqlSource(String sql, List<ParameterMapping> parameterMappings) {
		super();
		this.sql = sql;
		this.parameterMappings = parameterMappings;
	}

	@Override
	public BoundSql getBoundSql(Object param) {
		return new BoundSql(sql, parameterMappings);
	}

}
