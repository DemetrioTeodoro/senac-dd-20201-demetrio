package principal;

import java.util.ArrayList;

import model.dao.ClienteDAO;
import model.dao.EnderecoDAO;
import model.entity.Cliente;
import model.entity.Endereco;

public class Executavel {
	
	public static void main(String[] args) {
		
		
		EnderecoDAO endDAO = new EnderecoDAO();
		Endereco endereConsultado = new Endereco();
		
		endereConsultado = endDAO.consultarPorId(3);
		System.out.println("Endereco:" + endereConsultado);
		
		Cliente c1 = new Cliente();
		ClienteDAO clienteDAO = new ClienteDAO();
		
	}

}
