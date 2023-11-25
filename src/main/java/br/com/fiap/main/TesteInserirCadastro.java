package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;
import br.com.fiap.dao.CadastroDAO;

public class TesteInserirCadastro {
	
	static String text(String j) {
		return JOptionPane.showInputDialog(j);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CadastroDAO dao = new CadastroDAO();
		
		Cadastro objCadastro = new Cadastro();
		
		objCadastro.setEmail(text("Digite o E-mail"));
		objCadastro.setSenha(text("Digite a Senha"));
		
		System.out.println(dao.inserir(objCadastro));

	}

}
