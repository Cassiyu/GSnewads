package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;

public class TesteCadastro {
	 static String Texto(String mensagem) {
	        return JOptionPane.showInputDialog(mensagem);
	    }

	public static void main(String[] args) {
		
		Cadastro objCadastro = new Cadastro(
        		Texto("Digite seu E-mail"),
                Texto("Digite seu senha"));
		
		System.out.println(
        		"\nEmail: " + objCadastro.getEmail() +
                "\nSenha: " + objCadastro.getSenha());

	}

}
