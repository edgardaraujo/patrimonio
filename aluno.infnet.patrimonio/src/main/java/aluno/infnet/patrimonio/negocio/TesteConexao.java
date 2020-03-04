package aluno.infnet.patrimonio.negocio;

import java.util.List;

import aluno.infnet.patrimonio.modelo.Patrimonio;
import aluno.infnet.patrimonio.negocio.dao.PatrimonioJPADAO;

public class TesteConexao {
	
	public static void main(String[] args) {
		
		PatrimonioJPADAO dao = new PatrimonioJPADAO();
		List<Patrimonio> lista = dao.findAll();
		System.out.println(lista);
		
	}
	
}
