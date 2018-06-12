package com.pets.web.controllers;
import com.pets.web.models.Cat;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *  implementation class Cat
 */
@WebServlet("/Cat")
public class ShowCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCat() {
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
		// TODO Auto-generated method stub
		String name = request.getParameter("catName");
		String breed = request.getParameter("catBreed");
		int weight = Integer.valueOf(request.getParameter("catWeight"));
		Cat cat = new Cat(name,breed,weight);
		request.setAttribute("YourCat", cat);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Cat.jsp");
		view.forward(request, response);
		//doGet(request, response);
	}

}
