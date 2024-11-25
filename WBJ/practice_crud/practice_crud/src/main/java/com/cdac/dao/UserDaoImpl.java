package com.cdac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.pojos.User;

import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
	private Connection connection;
	private PreparedStatement pst1, pst2, pst3, pst4, pst5;

	public UserDaoImpl() throws SQLException {
		connection = openConnection();
		pst1 = connection.prepareStatement("INSERT INTO users1 (name, email) VALUES (?, ?)");
		pst2 = connection.prepareStatement("SELECT * FROM users1");
		pst3 = connection.prepareStatement("UPDATE users1 SET name = ?, email = ? WHERE id = ?");
		pst4 = connection.prepareStatement("DELETE FROM users1 WHERE id = ?");
		pst5 = connection.prepareStatement("SELECT * FROM users1 WHERE id = ?"); 
	}

	@Override
	public User getUser(int id) throws SQLException {
	    User user = null;
	    String query = "SELECT * FROM users1 WHERE id = ?";
	    try (PreparedStatement pst = connection.prepareStatement(query)) {
	        pst.setInt(1, id);
	        try (ResultSet rs = pst.executeQuery()) {
	            if (rs.next()) {
	                user = new User();
	                user.setId(rs.getInt("id"));
	                user.setName(rs.getString("name"));
	                user.setEmail(rs.getString("email"));
	            }
	        }
	    }
	    return user;
	}

	@Override
	public void addUser(User user) throws SQLException {
		pst1.setString(1, user.getName());
		pst1.setString(2, user.getEmail());
		pst1.executeUpdate();
	}

	@Override
	public List<User> getAllUsers() throws SQLException {
		List<User> users = new ArrayList<>();
		try (ResultSet rs = pst2.executeQuery()) {
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				users.add(user);

			}
		}
		return users;
	}

	@Override
	public void updateUser(User user) throws SQLException {
		pst3.setString(1, user.getName());
		pst3.setString(2, user.getEmail());
		pst3.setInt(3, user.getId());
		pst3.executeUpdate();

	}

	@Override
	public String deleteUser(int id) throws SQLException {
		pst4.setInt(1, id);
		int updateCount = pst4.executeUpdate();
		if (updateCount == 1)
			return "User details deleted successfully";
		return "User details are not deleted";

	}

	public void cleanUp() throws SQLException {
		// close pst1
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();
		if (pst5 != null)
			pst5.close();

		// close connection
		closeConnection();
		System.out.println("user dao cleaned up !");

	}

}
