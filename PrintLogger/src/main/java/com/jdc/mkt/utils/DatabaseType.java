package com.jdc.mkt.utils;

public enum DatabaseType {

	MYSQL("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3306/"),
	PSQL("org.postgresql.Driver","jdbc:postgresql://localhost:5432/"),
	H2("org.h2.Driver","jdbc:h2:mem:"),
	HSQL("org.hsqldb.jdbc.JDBCDriver","jdbc:hsql:mem://localhost:9001/");
	
	private String driverClassName;
	private String dbName;
	private String userName;
	private String password;
	private String url;
	
	private DatabaseType(String driverClassName,String url) {
		this.driverClassName = driverClassName;
		this.url = url;
	} 

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getDbName() {
		return dbName;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}
	
	
}
