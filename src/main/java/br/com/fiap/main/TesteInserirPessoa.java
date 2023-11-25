package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.dao.PessoaDAO;


public class TesteInserirPessoa {

	static String YNC(String mensagem) {
        int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Escolha uma opção", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            return "Sim";
        } else if (opcao == JOptionPane.NO_OPTION) {
            return "Não";
        } else {
            return "Cancelar";
        }
    }

    static String text(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    static int integer(String mensagem) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um valor inteiro válido.");
            }
        }
    }

    static double decimal(String mensagem) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um valor decimal válido.");
            }
        }
    }

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		PessoaDAO dao = new PessoaDAO();
		
		Pessoa objPessoa = new Pessoa();
		
		objPessoa.setId(integer("Digite seu ID"));
		objPessoa.setSexo(text("Digite seu Sexo"));
		objPessoa.setIdade(integer("Digite sua Idade"));
		objPessoa.setPeso(integer("Digite seu Peso"));
		objPessoa.setAltura(decimal("Digite sua Altura"));
		objPessoa.setFumante(YNC("Você Fuma?"));
		objPessoa.setAtividadeFisica(YNC("Você faz Atividade Fisica?"));
		objPessoa.setConsumirFrutas(YNC("Você Consome Frutas?"));
		objPessoa.setConsumirLegumes(YNC("Você Consome Legumes"));
		objPessoa.setDificuldadeLocomocao(YNC("Você tem Dificuldade de Locomoção?"));

		System.out.println(dao.inserir(objPessoa));

	}
}