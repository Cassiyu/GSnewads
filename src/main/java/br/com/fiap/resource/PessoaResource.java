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

import br.com.fiap.beans.Pessoa;
import br.com.fiap.bo.PessoaBO;

        @Path("/pessoa")
	    public class PessoaResource {
		
		private PessoaBO pessoaBO = new PessoaBO();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Pessoa> buscar() throws SQLException, ClassNotFoundException {
			return (ArrayList<Pessoa>) pessoaBO.selecionarBO();
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response inserirRs (Pessoa acs, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
			pessoaBO.inserirBO(acs);
			UriBuilder builder = uriInfo.getAbsolutePathBuilder();
			builder.path(Integer.toString(acs.getId()));
			return Response.created(builder.build()).build();		
		}
		
		@PUT
		@Path("/{id_pessoa}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response alterarRs (Pessoa acs, @PathParam("id_pessoa") int id_pessoa) throws SQLException, ClassNotFoundException {
			pessoaBO.alterarBO(acs);
			return Response.ok().build();
		}
		
		@DELETE
		@Path("/{id_pessoa}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response deletarRs (@PathParam("id_pessoa") int id_pessoa) throws ClassNotFoundException, SQLException {
			pessoaBO.deletarBO(id_pessoa);
			return Response.ok().build();
		}

}
