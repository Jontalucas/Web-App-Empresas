package servico;

import model.Empresa;
import dao.EmpresasDAO;
import java.util.ArrayList;
import java.util.List;


public class EmpresaService {
	
	private EmpresasDAO db = new EmpresasDAO();
	
	public List<Empresa> getEmpresas() {
		try {
			List<Empresa> empresas = db.getEmpresas();
                    
			return empresas;
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Empresa>();
		}
	}
}
