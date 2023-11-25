package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;
import br.com.fiap.beans.Pessoa;
import br.com.fiap.dao.CadastroDAO;
import br.com.fiap.dao.PessoaDAO;


public class TesteDeletar {
	
	static String text(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int integer(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		PessoaDAO dao1 = new PessoaDAO();
		
		CadastroDAO dao2 = new CadastroDAO();
		

		Pessoa objPessoa = new Pessoa();
		
		Cadastro objCadastro = new Cadastro();
	
		objPessoa.setId(integer("Digite o ID para deletar os dados"));
		System.out.println(dao1.deletar(objPessoa.getId()));
		
		
		objCadastro.setEmail(text("Digite o E-mail para deletar os dados"));
		System.out.println(dao2.deletar(objCadastro.getEmail()));
		

	}

}
