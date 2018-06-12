package com.pets.web.controllers;
//import com.pets.web.models.Cat;
import com.pets.web.models.Dog;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dog
 */
@WebServlet("/Dog")
public class ShowDog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/AdoptPet.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("dogName");
		String breed = request.getParameter("dogBreed");
		int weight = Integer.valueOf(request.getParameter("dogWeight"));
		Dog dog = new Dog(name,breed,weight);
		request.setAttribute("YourDog", dog);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Dog.jsp");
		view.forward(request, response);
		//doGet(request, response);
	}

}
