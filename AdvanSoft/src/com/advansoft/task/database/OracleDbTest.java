package com.advansoft.task.database;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class OracleDbTest {

	@Test
	public void Test() throws SQLException {
		OracleDb db=new OracleDb("system","siddiq");
		db.updateQuery("CREATE TABLE emp(id number(10),name varchar2(40),age number(3))");
		db.updateQuery("insert into emp values(1,siddiq,22)");
		ResultSet rs=db.query("select * from emp");
		while(rs.next()){
			assertEquals(rs.getInt(1), 1);
			assertEquals(rs.getString(2), "siddiq");
			assertEquals(rs.getInt(3), 22);
		}
	}

}
