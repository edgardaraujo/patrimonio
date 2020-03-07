package aluno.infnet.patrimonio.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aluno.infnet.patrimonio.modelo.Patrimonio;
import aluno.infnet.patrimonio.negocio.dao.JpaDAO;
import aluno.infnet.patrimonio.negocio.dao.PatrimonioJPADAO;

@WebServlet(urlPatterns ="/PatrimonioSrv")
public class PatrimonioServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private JpaDAO jpadao;
	
	public PatrimonioServlet() {
		// TODO Auto-generated constructor stub
		this.jpadao = new PatrimonioJPADAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		List<Patrimonio> patrimonios = jpadao.findAll();		
		
		System.out.println("lista patrimonio = "+patrimonios);
		
		req.setAttribute("lista_patrimonio", patrimonios);
		
		req.getRequestDispatcher("pages/patrimonio.jsp").forward(req, resp);
		
		System.out.println(patrimonios);
	}	

}
