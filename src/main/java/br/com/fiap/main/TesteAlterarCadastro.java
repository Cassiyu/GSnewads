package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;
import br.com.fiap.dao.CadastroDAO;

public class TesteAlterarCadastro {
	
	static String text(String j) {
		return JOptionPane.showInputDialog(j);
	}

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		CadastroDAO dao = new CadastroDAO();
		
		Cadastro objAcs = new Cadastro();
		
		objAcs.setEmail(text("Digite o E-mail"));
		objAcs.setSenha(text("Digite a Senha"));
		
		System.out.println(dao.alterar(objAcs));

	}

}
