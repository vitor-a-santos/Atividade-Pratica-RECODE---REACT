package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PassageiroDAO;
import model.Passageiro;
@WebServlet("/CreateAndFind")

public class PassageiroCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PassageiroCreateAndFind() {
        super(); }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa == null) {
			pesquisa="";
		}
		
		List<Passageiro> passageiros = PassageiroDAO.find(pesquisa);
		
		request.setAttribute("passageiros", passageiros);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("lista.jsp");
		resquesDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Passageiro passageiro = new Passageiro();
		
		passageiro.setNome(request.getParameter("nome"));
		passageiro.setCpf(request.getParameter("cpf"));
		passageiro.setIdade(request.getParameter("idade"));
		passageiro.setDestino(request.getParameter("destino"));
		passageiro.setPagamento(request.getParameter("pagamento"));
		
		PassageiroDAO.create(passageiro);
		
		doGet(request, response);
	}
}

