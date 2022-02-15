package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PassageiroDAO;
import model.Passageiro;


@WebServlet("/PassageiroUpdate")
public class PassageiroFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassageiroFindAndUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int passageiroId = Integer.parseInt(request.getParameter("passageiroId"));
		Passageiro passageiro = PassageiroDAO.findByPk(passageiroId);
		
		request.setAttribute("passageiro", passageiro);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Passageiro passageiro = new Passageiro();
		
		passageiro.setId(Integer.parseInt(request.getParameter("id")));
		passageiro.setNome(request.getParameter("nome"));
		passageiro.setCpf(request.getParameter("cpf"));
		passageiro.setIdade(request.getParameter("idade"));
		passageiro.setDestino(request.getParameter("destino"));
		passageiro.setPagamento(request.getParameter("pagamento"));
		
		PassageiroDAO.update(passageiro);
		
		PassageiroCreateAndFind passageiroCreateAndFind = new PassageiroCreateAndFind();
		passageiroCreateAndFind.doGet(request, response);
	}

}