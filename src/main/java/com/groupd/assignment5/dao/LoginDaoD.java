package com.groupd.assignment5.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.groupd.assignment5.beans.Login;

/**
 * Date: 05.04.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal DAO class for Login table
 */
//This class adds new visitors, also updates the staff through admin
public class LoginDaoD {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

//	login, register (visitor)
	public Login user_exists(Login login) {
		List<Login> users = template.query(
				"select username, password, usertype from login where username='" + login.getUsername()
						+ "' and password='" + login.getPassword() + "' and usertype = '" + login.getUsertype() + "'",
				new RowMapper<Login>() {
					public Login mapRow(ResultSet rs, int row) throws SQLException {
						Login e = new Login();
						e.setUsername(rs.getString(1));
						e.setPassword(rs.getString(2));
						e.setUsertype(rs.getString(3));
						return e;
					}
				});
		if (users.size() > 0) {
			users.get(0).setCustomer_id((Integer) template.queryForObject(
					"select Customer_id from customer where username = " + "'" + users.get(0).getUsername() + "'",
					Integer.class));
			return users.get(0);
		} else {
			return null;
		}

	}

//	for Adding users
	public void AddUser(Login login) {
		String sql = "insert into login (username, password, usertype) values('" + login.getUsername() + "','"
				+ login.getPassword() + "','" + login.getUsertype() + "')";
		template.update(sql);

		sql = "insert into customer (username) VALUES ('" + login.getUsername() + "');";
		template.update(sql);
	}

	public void UpdateStaff(Login login) {
		String sql = "UPDATE login SET password = '" + login.getPassword() + "' WHERE username = '"
				+ login.getUsername() + "'";
		template.update(sql);
	}

	public List<Login> GetStaffs() {
		return template.query("SELECT * FROM login WHERE usertype='staff';", new RowMapper<Login>() {
			@Override
			public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
				Login login = new Login();
				login.setUsername(rs.getString(1));
				login.setPassword(rs.getString(2));
				login.setUsertype(rs.getString(3));
				return login;
			}
		});
	}

	public Login getOneStaff(String username) {
		return template.query("SELECT * FROM login WHERE username = '" + username + "'", new RowMapper<Login>() {
			@Override
			public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
				Login obj = new Login();
				obj.setUsername(rs.getString(1));
				obj.setPassword(rs.getString(2));
				obj.setUsertype(rs.getString(3));
				return obj;
			}
		}).get(0);
	}

}