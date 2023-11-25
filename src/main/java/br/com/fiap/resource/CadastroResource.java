package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.Cadastro;
import br.com.fiap.bo.CadastroBO;

        @Path("/Cadastro")
	    public class CadastroResource {
		
		private CadastroBO cadastroBO = new CadastroBO();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Cadastro> buscar() throws SQLException, ClassNotFoundException {
			return (ArrayList<Cadastro>) cadastroBO.selecionarBO();
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response inserirRs (Cadastro acs, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
			cadastroBO.inserirBO(acs);
			UriBuilder builder = uriInfo.getAbsolutePathBuilder();
			builder.path((acs.getEmail()));
			return Response.created(builder.build()).build();		
		}
		
		@PUT
		@Path("/{email_cadastro}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response alterarRs (Cadastro acs, @PathParam("email_cadastro") int id_pessoa) throws SQLException, ClassNotFoundException {
			cadastroBO.alterarBO(acs);
			return Response.ok().build();
		}
		
		@DELETE
		@Path("/{email_cadastro}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response deletarRs (@PathParam("email_cadastro") String email_cadastro) throws ClassNotFoundException, SQLException {
			cadastroBO.deletarBO(email_cadastro);
			return Response.ok().build();
		}

}
