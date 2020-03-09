package aluno.infnet.patrimonio.negocio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import aluno.infnet.patrimonio.modelo.Patrimonio;
import aluno.infnet.patrimonio.negocio.MysqlConnection;

public class PatrimonioDAO {

	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;

	public PatrimonioDAO() {
		this.con = MysqlConnection.getConnection();
	}

	// Seleciona Patrimonio pelo id
	public Patrimonio selectPatrimonio(int id) {
		Patrimonio pat = null;
		String sql = "select id,descricao,localizacao from patrimonio where id =?";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();

			while (rs.next()) {
				String descricao = rs.getString("descricao");
				String localizacao = rs.getString("localizacao");
				pat = new Patrimonio(descricao, localizacao);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return pat;
	}

	// inserir Patrimonio
	public void insertPatrimonio(Patrimonio patrimonio) {
		String sql = "insert into patrimonio(descricao,localizacao) values(?,?)";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, patrimonio.getDescricao());
			pstm.setString(2, patrimonio.getLocalizacao());
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Update Patrimonio
	public boolean updatePatrimonio(Patrimonio patrimonio) {
		String sql = "update patrimonio set descricao = ?, localizacao = ? where id = ?";
		boolean rowUpdated;
		rowUpdated = false;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, patrimonio.getDescricao());
			pstm.setString(2, patrimonio.getLocalizacao());
			pstm.setInt(3, patrimonio.getId());
			rowUpdated = pstm.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	// Delete
	public boolean deletePatrimonio(int id) throws SQLException {
		boolean rowDeleted;
		String sql = "delete from patrimonio where id =?";
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		rowDeleted = pstm.executeUpdate() > 0;
		return rowDeleted;
	}

	// List
	public List<Patrimonio> findAllPatrimonio() {
		String sql = "select * from patrimonio";
		List<Patrimonio> lista = new ArrayList<Patrimonio>();

		try {
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Patrimonio pat = new Patrimonio();
				pat.setId(rs.getInt("id"));
				pat.setDescricao(rs.getString("descricao"));
				pat.setLocalizacao(rs.getString("localizacao"));
				lista.add(pat);
			}
			return lista;
		} catch (Exception e) {
			System.out.println("erro ao recuperar patrimonio");
		}
		return null;
	}

}
