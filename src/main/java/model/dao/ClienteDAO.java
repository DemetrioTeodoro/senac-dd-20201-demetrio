package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.entity.Cliente;

public class ClienteDAO implements BaseDAO<Cliente>{

	public Cliente salvar(Cliente novaEntidade) {
		Connection conn = Banco.getConnection();
		String sql = " INSERT INTO CLIENTE (nome,sobrenome,cpf) VALUES (?,?,?); ";
		PreparedStatement stmt = Banco.getPreparedStatement(conn, sql);

		try {
			stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

		} catch (SQLException e) {
			System.out.println(" Erro ao salvar cliente. Erro: " + e.getMessage());
		}
		return novaEntidade;
	}

	public boolean alterar(Cliente novaEntidade) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Cliente> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente consultarPorId(int id) {
		Connection conn = Banco.getConnection();
		String sql = " SELECT * FROM CLIENTE WHERE ID=?; ";
		PreparedStatement stmt = Banco.getPreparedStatement(conn, sql);
		Cliente cliente = null;
		
		try {
			stmt.setInt(1, id);
			ResultSet resultado = stmt.executeQuery();
			if (resultado.next()) {
				cliente = construirResultSet(resultado);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consultar cliente no id=" + id + " Causa " + e.getMessage());
		}
		
		return cliente;
		
	}

	public Cliente construirResultSet(ResultSet resultado) {
		Cliente cliente = new Cliente();
		
		try {
			cliente.setId(resultado.getInt("id"));
			cliente.setNome(resultado.getString("nome"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
