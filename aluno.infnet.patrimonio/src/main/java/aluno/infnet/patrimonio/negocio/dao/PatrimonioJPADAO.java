package aluno.infnet.patrimonio.negocio.dao;

import aluno.infnet.patrimonio.modelo.Patrimonio;

public class PatrimonioJPADAO extends JpaDAO<Patrimonio, Integer>{
	
	public PatrimonioJPADAO() {
		super(Patrimonio.class);
	}
	
}
