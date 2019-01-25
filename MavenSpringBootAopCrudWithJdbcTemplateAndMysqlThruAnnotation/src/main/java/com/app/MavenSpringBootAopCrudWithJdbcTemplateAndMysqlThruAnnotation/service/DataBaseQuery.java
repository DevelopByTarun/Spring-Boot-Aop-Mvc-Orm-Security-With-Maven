package com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.service;

public interface DataBaseQuery {
	
	public static final String SQL_FIND_PERSON = "select * from peoplejdbcboot where id = ?";
	
	public static final String SQL_DELETE_PERSON = "delete from peoplejdbcboot where id = ?";
	
	public static final String SQL_UPDATE_PERSON = "update peoplejdbcboot set first_name = ?, last_name = ?, age  = ? where id = ?";
	
	public static final String SQL_GET_ALL = "select * from peoplejdbcboot";
	
	public static final String SQL_INSERT_PERSON = "insert into peoplejdbcboot(id, first_name, last_name, age) values(?,?,?,?)";
}
