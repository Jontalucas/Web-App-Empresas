package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Empresa;

public class EmpresasDAO extends BaseDAO{
	public List<Empresa> getEmpresas() throws SQLException {
		List<Empresa> empresas = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select * from carro");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Empresa e = createEmpresa(rs);
				empresas.add(e);
			}
			rs.close();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return empresas;
	}
	
	public Empresa createEmpresa(ResultSet rs) throws SQLException {
		Empresa e = new Empresa();
		e.setId(rs.getInt("id"));
		e.setNome(rs.getString("nome"));
		e.setEndereco(rs.getString("endereco"));
		
		return e;
	}
}
