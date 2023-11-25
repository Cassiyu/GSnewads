package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.dao.PessoaDAO;

public class TesteAlterarPessoa {

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
		// Instanciar objetos
		
		Pessoa objAcs = new Pessoa();
		
		PessoaDAO dao = new PessoaDAO();
		
		objAcs.setId(integer("Digite seu ID"));
		objAcs.setSexo(text("Digite seu Sexo"));
		objAcs.setIdade(integer("Digite sua Idade"));
		objAcs.setPeso(integer("Digite seu Peso"));
		objAcs.setAltura(decimal("Digite sua Altura"));
		objAcs.setFumante(YNC("Você Fuma?"));
		objAcs.setAtividadeFisica(YNC("Você fazAtividade Fisica?"));
		objAcs.setConsumirFrutas(YNC("Você Consome Frutas?"));
		objAcs.setConsumirLegumes(YNC("Você Consome Legumes?"));
		objAcs.setDificuldadeLocomocao(YNC("Você tem Dificuldade de Locomoção?"));

		System.out.println(dao.alterar(objAcs));
	}

}