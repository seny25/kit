package controller;

import java.io.IOException;
import java.sql.Connection;


import db.DbConnection;



/**
 * Servlet implementation class Question

 */
public class Question extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Connection connection=DbConnection.getConnection();
       
	private Question question;
	public void init() {
		question=new Question();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question() {
        super();
        // TODO Auto-generated constructor stub
    
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws  IOException {
	
		
		RequestDispatcher  rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
