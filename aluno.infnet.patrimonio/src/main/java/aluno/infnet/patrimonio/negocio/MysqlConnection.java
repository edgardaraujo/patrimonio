package aluno.infnet.patrimonio.negocio;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {
	
	private static Connection con;
	
	private MysqlConnection() {}
	
	public static Connection getConnection() {
		if(con ==null) {
			String url = "jdbc:mysql://localhost:3306/patrimonio?useTimezone=true&serverTimezone=UTC&createDatabaseIfNotExist=true";
			String user = "root";
			String pass = "root@321";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, user, pass);
				return con;
			} catch (Exception e) {
				System.out.println("Erro ao obter conexão");
				throw new RuntimeException("Erro ao obter conexão");
			}		
		
		}
		return con;
	}

}
