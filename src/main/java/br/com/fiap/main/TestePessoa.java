package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.beans.Pessoa;

public class TestePessoa {


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

    static String Texto(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    static int Inteiro(String mensagem) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um valor inteiro válido.");
            }
        }
    }

    static double Decimal(String mensagem) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um valor decimal válido.");
            }
        }
    }

    public static void main(String[] args) {

        Pessoa objPessoa = new Pessoa(
        		Inteiro("Digite seu ID?"),
                Texto("Digite seu sexo?"),
                Inteiro("Digite sua idade?"),
                Inteiro("Digite seu peso?"),
                Decimal("Digite sua altura?"),
                YNC("Você é fumante?"),
                YNC("Você faz atividade física?"),
                YNC("Você consome frutas?"),
                YNC("Você consome legumes?"),
                YNC("Você tem dificuldade de locomoção?")
        );

        System.out.println(
        		"\nId: " + objPessoa.getId() +
                "\nSexo: " + objPessoa.getSexo() +
                "\nIdade: " + objPessoa.getIdade() +
                "\nPeso: " + objPessoa.getPeso() +
                "\nAltura: " + objPessoa.getAltura() +
                "\nFumante: " + objPessoa.getFumante() +
                "\nAtividade Física: " + objPessoa.getAtividadeFisica() +
                "\nConsome Frutas: " + objPessoa.getConsumirFrutas() +
                "\nConsome Legumes: " + objPessoa.getConsumirLegumes() +
                "\nDificuldade de Locomoção: " + objPessoa.getDificuldadeLocomocao());
        double imc = objPessoa.getImc();

        System.out.println("O seu IMC é: " + imc);
       
    }
}

