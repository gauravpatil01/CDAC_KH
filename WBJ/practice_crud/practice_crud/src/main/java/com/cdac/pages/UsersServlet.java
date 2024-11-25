package com.cdac.pages;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/users")
public class UsersServlet extends HttpServlet {
	private UserDao userDao;

	@Override
	public void init() {
		try {
			userDao = new UserDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null)
			action = "list";

		try {
			switch (action) {
			case "new":
				RequestDispatcher dispatcherNew = request.getRequestDispatcher("add.jsp");
				dispatcherNew.forward(request, response);
				break;

			case "edit":
				int id = Integer.parseInt(request.getParameter("id"));
				User existingUser = userDao.getUser(id);
				RequestDispatcher dispatcherEdit = request.getRequestDispatcher("edit.jsp");
				request.setAttribute("user", existingUser);
				dispatcherEdit.forward(request, response);
				break;

			case "delete":
				int deleteId = Integer.parseInt(request.getParameter("id"));
				userDao.deleteUser(deleteId);
				response.sendRedirect("users");
				break;

			default:
				List<User> users = userDao.getAllUsers();
				request.setAttribute("users", users);
				RequestDispatcher dispatcherList = request.getRequestDispatcher("list.jsp");
				dispatcherList.forward(request, response);
				break;
			}
		} catch (Exception e) {
			throw new ServletException("Error processing action: " + action, e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			if ("add".equals(action)) {
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				User user = new User();
				user.setName(name);
				user.setEmail(email);
				userDao.addUser(user);

			} else if ("update".equals(action)) {
				int id = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name"); // doubt
				String email = request.getParameter("email");
				User user = new User();
				user.setId(id);
				user.setName(name);
				user.setEmail(email);
				userDao.updateUser(user);

			} else if ("delete".equals(action)) {

				int id = Integer.parseInt(request.getParameter("id"));
				System.out.println(id);
				userDao.deleteUser(id);

			}
			response.sendRedirect("users");
		} catch (Exception e) {
			throw new ServletException("in doxxx" + getClass(), e);
		}
	}
}
