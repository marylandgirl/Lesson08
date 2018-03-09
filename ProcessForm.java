package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.*;

import com.example.demo.Customer;
/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Kristina Simspon", "94 Grant Street", "Chester", "MO", "46782"));
		customers.add(new Customer("Vanessa Brown", "4337 Prudence Street", "White River Junction", "ND", "48219"));
		customers.add(new Customer("Darryl Porter", "608 Berkley Street", "Columbus", "OH", "64062"));
		customers.add(new Customer("Joseph Twiggs", "1719 Boone Street", "Lawson", "KY", "95814"));
		request.setAttribute("customers", customers);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
