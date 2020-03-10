package aluno.infnet.patrimonio.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aluno.infnet.patrimonio.negocio.dao.PatrimonioJPADAO;

@WebServlet(name = "deletar-patrimonio", urlPatterns = "/delete/*")
public class DeletarSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PatrimonioJPADAO jpadao;

	public DeletarSrv() {
		this.jpadao = new PatrimonioJPADAO();
	}
	


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        int id = Integer.parseInt(pathParts[1]);

        jpadao.delete(id);

        resp.sendRedirect(req.getContextPath());
    }
}