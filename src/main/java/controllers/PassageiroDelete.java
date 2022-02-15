package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PassageiroDAO;

@WebServlet("/PassageiroDEL")
public class PassageiroDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PassageiroDelete() {
        super();
       
    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int passageiroId = Integer.parseInt(request.getParameter("passageiroId"));
		PassageiroDAO.delete(passageiroId);
		
		PassageiroCreateAndFind passageiroCreateAndFind = new PassageiroCreateAndFind();
		passageiroCreateAndFind.doGet(request, response);
		
	}

}