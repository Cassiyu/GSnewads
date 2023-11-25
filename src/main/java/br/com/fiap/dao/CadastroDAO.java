package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cadastro;
import br.com.fiap.conexoes.ConexaoFactory;

public class CadastroDAO {
	
	 private Connection minhaConexao;

	public CadastroDAO() throws ClassNotFoundException, SQLException {
	        super();
	        this.minhaConexao = new ConexaoFactory().conexao();
	    }
	
//Inserir
    
    public String inserir(Cadastro cadastro) throws SQLException {

        String sql = "INSERT INTO T_FIAP_CADASTRO ( email_cadastro, senha_cadastro ) VALUES (?, ?)";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setString(1, cadastro.getEmail());
        stmt.setString(2, cadastro.getSenha());
        stmt.executeUpdate();
        stmt.close();

        return "Cadastro feito com sucesso.";
    }
    
//Deletar
    
    public String deletar(String email_cadastro) throws SQLException {

        String sql = "DELETE FROM T_FIAP_CADASTRO WHERE email_cadastro = ?";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setString(1, email_cadastro);
        stmt.executeUpdate();
        stmt.close();

        return "Cadastro deletado com sucesso.";
    }
    
 //Alterar
    
    public String alterar(Cadastro cadastro) throws SQLException {

        String sql = "UPDATE T_FIAP_CADASTRO SET senha_cadastro = ? WHERE email_cadastro = ?";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setString(1, cadastro.getEmail());
        stmt.setString(2, cadastro.getSenha());
        stmt.executeUpdate();
        stmt.close();

        return "Cadastro alterado com sucesso.";
    }
    
 //Selecionar
    
    public List<Cadastro> selecionar() throws SQLException {
    	List<Cadastro> listaCadastro = new ArrayList<Cadastro>();
    	
    	PreparedStatement stmt = minhaConexao.prepareStatement
    			("SELECT * FROM T_FIAP_CADASTRO");
    	
    	ResultSet rs = stmt.executeQuery();
    	
    	while (rs.next()) {
    		Cadastro acs = new Cadastro();
    		acs.setEmail(rs.getString(1));
    		acs.setSenha(rs.getString(2));
    		listaCadastro.add(acs);
		}
    	return listaCadastro;
    }


}
