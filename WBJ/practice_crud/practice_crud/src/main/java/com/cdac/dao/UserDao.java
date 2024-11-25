package com.cdac.dao;

import java.sql.SQLException;
import java.util.List;

import com.cdac.pojos.User;

public interface UserDao {
	void addUser(User user) throws SQLException;
    List<User> getAllUsers() throws SQLException;
    User getUser(int id) throws SQLException;
    void updateUser(User user) throws SQLException;
    String deleteUser(int id) throws SQLException;
    void cleanUp() throws SQLException;
}
