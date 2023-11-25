package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.dao.PessoaDAO;

public class PessoaBO {
	
	PessoaDAO acsDao;
	
	   // Selecionar
		public ArrayList<Pessoa> selecionarBO() throws SQLException, ClassNotFoundException{
			acsDao = new PessoaDAO();
			return (ArrayList<Pessoa>) acsDao.selecionar();
		}
		
		// Inserir
		public void inserirBO(Pessoa acs) throws ClassNotFoundException, SQLException {
			PessoaDAO acsDao = new PessoaDAO();
			acsDao.inserir(acs);
		}
		
		// Alterar
		public void alterarBO(Pessoa acs) throws ClassNotFoundException, SQLException {
			PessoaDAO acsDao = new PessoaDAO();
			acsDao.alterar(acs);
		}
		
		// Deletar
		public void deletarBO(int id_pessoa) throws ClassNotFoundException, SQLException {
			PessoaDAO acsDao = new PessoaDAO();
			acsDao.deletar(id_pessoa);
		}

}
