package aluno.infnet.patrimonio.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aluno.infnet.patrimonio.modelo.Patrimonio;
import aluno.infnet.patrimonio.negocio.dao.PatrimonioJPADAO;

@WebServlet(name = "editar-patrimonio", urlPatterns = "/edit")
public class EditarSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PatrimonioJPADAO jpadao;

	public EditarSrv() {
		this.jpadao = new PatrimonioJPADAO();
	}
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        int id = Integer.parseInt(req.getParameter("id"));

	        Patrimonio patrimonio = jpadao.find(id);

	        req.setAttribute("patrimonio", patrimonio);

	        req.getRequestDispatcher("pages/editar.jsp")
	                .forward(req, resp);
	    }

	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	req.setCharacterEncoding("UTF-8");
	    	int id = Integer.parseInt(req.getParameter("id"));
	        String descricao = req.getParameter("descricao");
	        String localizacao = req.getParameter("localizacao");

	        Patrimonio patrimonio = jpadao.find(id);

	        patrimonio.setDescricao(descricao);
	        patrimonio.setLocalizacao(localizacao);

	        jpadao.update(patrimonio);

	        resp.sendRedirect(req.getContextPath());
	    }
	}