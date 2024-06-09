package rest;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Empresa;
import servico.EmpresaService;


@Path("/empresas")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class EmpresasResource {
	private EmpresaService empresaService = new EmpresaService();

	@GET
	public List<Empresa> get() {
		List<Empresa> empresas = empresaService.getEmpresas();
		return empresas;
	}
}
