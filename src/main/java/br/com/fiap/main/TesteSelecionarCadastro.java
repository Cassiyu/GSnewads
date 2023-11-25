package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cadastro;
import br.com.fiap.dao.CadastroDAO;


public class TesteSelecionarCadastro {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		CadastroDAO dao = new CadastroDAO();
		

		List<Cadastro> listaCadastro = (ArrayList<Cadastro>) dao.selecionar();
		
		if (listaCadastro != null) {
			for (Cadastro Cadastro : listaCadastro) {
				System.out.println(
		        		"\nE-mail: " + Cadastro.getEmail() +
		                "\nSenha: " + Cadastro.getSenha());
			}
		}
      
	}
}			
