package com.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jdbc.bean.Employee;

public class CustomerDetails {
	private final String SQL_SELECT_EMPLOYEE = "SELECT * FROM employee";
	private final String SQL_INSERT_STUDENT = "insert into employee(eid,name,salary) values(?,?,?)";

	public JdbcTemplate jdbcTemplate;

	public CustomerDetails(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employee> findAllDetails() {

		List<Employee> employees = (List<Employee>) jdbcTemplate.query(SQL_SELECT_EMPLOYEE, new EmployeeRowMapper());
		return employees;
	}

	private static final class EmployeeRowMapper implements RowMapper<Employee> {
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

			Employee employee = new Employee();
			employee.setEid(rs.getInt("eid"));
			employee.setName(rs.getString("name"));
			employee.setSalary(rs.getFloat("salary"));

			return employee;
		}
	}	
	  /*public int saveEmployeeDetails(int eId,String name,float salary) {
	  System.out.println("save Details"); 
	  return jdbcTemplate.update(SQL_INSERT_STUDENT, new Object[] {eId,name,salary});
	  }*/
	 

	public int saveEmployeeDetails(Employee empl) {
		System.out.println("save Details");
		return jdbcTemplate.update(SQL_INSERT_STUDENT, new Object[] { empl });
	}

}
