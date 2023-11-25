package br.com.fiap.main;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.http.client.ClientProtocolException;
import br.com.fiap.model.API;
import br.com.fiap.service.APIService;


public class TesteAPI {

    public static void main(String[] args) throws ClientProtocolException, IOException {
    	APIService swService = new APIService();

        String na = JOptionPane.showInputDialog("Informe um numeros de \n18 a 24 \n25 a 29 \n30 a 34 \n35 a 39 \n40 a 44 \n45 a 49 \n50 a 54 \n55 a 59 \n60 a 64 \n65 a 69 \n70 a 74 \n75 a 79 \n80 a ++  \na ser pesquisado.");

        API api = swService.getAPI(na);
		if (api != null) {
		    System.out.println("Informações da API:");
		    System.out.println(api);
		    
		} else {
		    System.out.println("API não encontrada.");
		}
		       
		        
		       
		}

    }
      

