package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.dao.PessoaDAO;

public class TesteSelecionarPessoa {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		PessoaDAO dao = new PessoaDAO();
		

		List<Pessoa> listaPessoas = (ArrayList<Pessoa>) dao.selecionar();
		
		if (listaPessoas != null) {
			for (Pessoa Pessoa : listaPessoas) {
				System.out.println(
		        		"\nID: " + Pessoa.getId() +
		                "\nSexo: " + Pessoa.getSexo() +
		                "\nIdade: " + Pessoa.getIdade() +
		                "\nPeso: " + Pessoa.getPeso() +
		                "\nAltura: " + Pessoa.getAltura() +
		                "\nFumante: " + Pessoa.getFumante() +
		                "\nAtividade Física: " + Pessoa.getAtividadeFisica() +
		                "\nConsome Frutas: " + Pessoa.getConsumirFrutas() +
		                "\nConsome Legumes: " + Pessoa.getConsumirLegumes() +
		                "\nDificuldade de Locomoção: " + Pessoa.getDificuldadeLocomocao());
				
			}
		}
		
	}

}
