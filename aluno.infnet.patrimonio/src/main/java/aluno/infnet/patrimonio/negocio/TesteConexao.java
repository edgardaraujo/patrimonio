package aluno.infnet.patrimonio.negocio;

import java.util.List;

import aluno.infnet.patrimonio.modelo.Patrimonio;
import aluno.infnet.patrimonio.negocio.dao.PatrimonioJPADAO;

public class TesteConexao {
	
	public static void main(String[] args) {
		
		PatrimonioJPADAO dao = new PatrimonioJPADAO();
		
		//criar patrimonio
		//Patrimonio patrimonio = new Patrimonio();
		//patrimonio.setDescricao("Dell Inspiron 15");
		//patrimonio.setLocalizacao("Sala 101 - prédio auxiliar");
		//dao.save(patrimonio);
		
		//deletar por id
		//Patrimonio patrimonio = dao.find(1);
		//dao.delete(patrimonio);
		
		//listar por id
		//Patrimonio patrimonio = dao.find(1);
		//System.out.println("find patrimonio(1) = "+patrimonio);
		
		//listar todos
		List<Patrimonio> lista = dao.findAll();
		System.out.println("lista patrimonio = "+lista);		
	}	
}
