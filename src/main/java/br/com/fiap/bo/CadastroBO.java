package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Cadastro;
import br.com.fiap.dao.CadastroDAO;


public class CadastroBO {
	
	CadastroDAO acsDao;
	
	   // Selecionar
		public ArrayList<Cadastro> selecionarBO() throws SQLException, ClassNotFoundException{
			acsDao = new CadastroDAO();
			return (ArrayList<Cadastro>) acsDao.selecionar();
		}
		
		// Inserir
		public void inserirBO(Cadastro acs) throws ClassNotFoundException, SQLException {
			CadastroDAO acsDao = new CadastroDAO();
			acsDao.inserir(acs);
		}
		
		// Alterar
		public void alterarBO(Cadastro acs) throws ClassNotFoundException, SQLException {
			CadastroDAO acsDao = new CadastroDAO();
			acsDao.alterar(acs);
		}
		
		// Deletar
		public void deletarBO(String email_cadastro) throws ClassNotFoundException, SQLException {
			CadastroDAO acsDao = new CadastroDAO();
			acsDao.deletar(email_cadastro);
		}


}
