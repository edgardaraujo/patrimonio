package aluno.infnet.patrimonio.controler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aluno.infnet.patrimonio.modelo.Patrimonio;
import aluno.infnet.patrimonio.negocio.dao.JpaDAO;
import aluno.infnet.patrimonio.negocio.dao.PatrimonioDAO;

@WebServlet("/")
public class PatrimonioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PatrimonioDAO dao;
	private JpaDAO jpadao;

	public PatrimonioServlet() {
		this.dao = new PatrimonioDAO();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewFormulario(req, resp);
				break;
			case "/insert":
				insertPatrimonio(req, resp);
				break;
			case "/delete":
				deletePatrimonio(req, resp);
				break;
			case "/edit":
				showEditFormulario(req, resp);
				break;
			case "/update":
				updatePatrimonio(req, resp);
				break;
			default:
				listPatrimonio(req, resp);
				break;

			}
		} catch (SQLException e) {
			throw new ServletException(e);
		}

	}

	// Mostrar formulário para inserir novo patrimonio
	private void showNewFormulario(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("pages/adicionar.jsp");
		dispatcher.forward(req, resp);
	}

	// Inserir novo patrimonio no banco de dados
	private void insertPatrimonio(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String descr = req.getParameter("descricao");
		String local = req.getParameter("localizacao");
		Patrimonio npat = new Patrimonio(descr, local);
		dao.insertPatrimonio(npat);
		resp.sendRedirect("list");
	}

	// Deletar patrimonio do banco de dados
	private void deletePatrimonio(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(req.getParameter("id"));
		dao.deletePatrimonio(id);
		resp.sendRedirect("list");
	}

	// Mostrar formulário para editar patrimonio
	private void showEditFormulario(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Patrimonio currentPatrimonio = dao.selectPatrimonio(id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("pages/adicionar.jsp");
		req.setAttribute("patrimonio", currentPatrimonio);
		dispatcher.forward(req, resp);
	}

	// Update Patrimonio no banco
	private void updatePatrimonio(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String descr = req.getParameter("descricao");
		String local = req.getParameter("localizacao");
		Patrimonio pat = new Patrimonio(id,descr,local);
		dao.updatePatrimonio(pat);
		resp.sendRedirect("list");
	}

	// Método Default - listar patrimonio
	private void listPatrimonio(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Patrimonio> lista = dao.findAllPatrimonio();
		req.setAttribute("listaPatrimonio", lista);
		RequestDispatcher dispatcher = req.getRequestDispatcher("pages/patrimonio.jsp");
		dispatcher.forward(req, resp);
	}

}
