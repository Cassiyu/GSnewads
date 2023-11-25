package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.conexoes.ConexaoFactory;

public class PessoaDAO {
	
    private Connection minhaConexao;
    
    public PessoaDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }
    
    //Inserir
    
    public String inserir(Pessoa pessoa) throws SQLException {

        String sql = "INSERT INTO T_FIAP_PESSOA (id_pessoa, sexo_pessoa, idade_pessoa, peso_pessoa, altura_pessoa, fumante_pessoa, atividadefisica_pessoa, consumirfrutas_pessoa, consumirlegumes_pessoa, dificuldadelocomocao_pessoa) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setInt(1, pessoa.getId());
        stmt.setString(2, pessoa.getSexo());
        stmt.setInt(3, pessoa.getIdade());
        stmt.setInt(4, pessoa.getPeso());
        stmt.setDouble(5, pessoa.getAltura());
        stmt.setString(6, pessoa.getFumante());
        stmt.setString(7, pessoa.getAtividadeFisica());
        stmt.setString(8, pessoa.getConsumirFrutas());
        stmt.setString(9, pessoa.getConsumirLegumes());
        stmt.setString(10, pessoa.getDificuldadeLocomocao());
		stmt.execute();
        stmt.close();

        return "Pessoa cadastrada com sucesso.";
    }
    
    //Deletar
    
    public String deletar(int id_pessoa) throws SQLException {

        String sql = "DELETE FROM T_FIAP_PESSOA WHERE id_pessoa = ?";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setInt(1, id_pessoa);
		stmt.execute();
        stmt.close();

        return "Pessoa deletada com sucesso.";
    }
    
    //Alterar
    
    public String alterar(Pessoa pessoa) throws SQLException {

        String sql = "UPDATE T_FIAP_PESSOA SET sexo_pessoa = ?, idade_pessoa = ?, peso_pessoa = ? , altura_pessoa = ?, fumante_pessoa = ?, atividadefisica_pessoa = ?, consumirfrutas_pessoa = ?, consumirlegumes_pessoa = ?, dificuldadelocomocao_pessoa = ? WHERE id_pessoa = ?";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setString(1, pessoa.getSexo());
        stmt.setInt(2, pessoa.getIdade());
        stmt.setInt(3, pessoa.getPeso());
        stmt.setDouble(4, pessoa.getAltura());
        stmt.setString(5, pessoa.getFumante());
        stmt.setString(6, pessoa.getAtividadeFisica());
        stmt.setString(7, pessoa.getConsumirFrutas());
        stmt.setString(8, pessoa.getConsumirLegumes());
        stmt.setString(9, pessoa.getDificuldadeLocomocao());
        stmt.setInt(10, pessoa.getId());
		stmt.executeUpdate();
        stmt.close();

        return "Pessoa alterada com sucesso.";
    }
    
    //Selecionar
    
    public List<Pessoa> selecionar() throws SQLException {
    	List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
    	
    	PreparedStatement stmt = minhaConexao.prepareStatement
    			("SELECT * FROM T_FIAP_PESSOA");
    	
    	ResultSet rs = stmt.executeQuery();
    	
    	while (rs.next()) {
    		Pessoa acs = new Pessoa();
    		acs.setId(rs.getInt(1));
    		acs.setSexo(rs.getString(2));
    		acs.setIdade(rs.getInt(3));
    		acs.setPeso(rs.getInt(4));
    		acs.setAltura(rs.getDouble(5));
    		acs.setFumante(rs.getString(6));
    		acs.setAtividadeFisica(rs.getString(7));
    		acs.setConsumirFrutas(rs.getString(8));
    		acs.setConsumirLegumes(rs.getString(9));
    		acs.setDificuldadeLocomocao(rs.getString(10));
    		listaPessoa.add(acs);
		}
    	return listaPessoa;
    }



}