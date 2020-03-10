package aluno.infnet.patrimonio.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aluno.infnet.patrimonio.modelo.Patrimonio;
import aluno.infnet.patrimonio.negocio.dao.PatrimonioJPADAO;

@WebServlet(name = "patrimonio", urlPatterns = "")
public class PatrimonioSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PatrimonioJPADAO jpadao;

	public PatrimonioSrv() {
		this.jpadao = new PatrimonioJPADAO();
	}
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Patrimonio> patrimonios = jpadao.findAll();

        req.setAttribute("listaPatrimonio", patrimonios);

        req.getRequestDispatcher("pages/patrimonio.jsp")
                .forward(req, resp);
    }

}