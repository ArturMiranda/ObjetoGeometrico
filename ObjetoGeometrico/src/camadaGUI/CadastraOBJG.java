package camadaGUI;

import classesExceptions.MedidaException;
import classesExceptions.QuantidadeException;
import classesExceptions.RemocaoInvalidaException;
import camadaDados.InterfaceRepositorioOBJG;
import camadaNegocio.InterfaceOBJG;


public class CadastraOBJG {
	
	private InterfaceRepositorioOBJG objetos;
	
	public CadastraOBJG(InterfaceRepositorioOBJG objetos){
		this.objetos = objetos;
	}
	
	public void imprimir() throws MedidaException{
		objetos.imprimir();
	}
	
	public void inserir(InterfaceOBJG objetoGeometrico) throws QuantidadeException {
		objetos.inserir(objetoGeometrico);
	}
	
	public void removerPrimeiro() throws RemocaoInvalidaException {
		objetos.removerPrimeiro();
	}
	
	public void removerUltimo() throws RemocaoInvalidaException {
		objetos.removerUltimo();
	}
	
	public int getTamanhoCache() {
		return objetos.getTamanhoCache();
	}
	
	public int getQuantidadeObjetos() {
		return objetos.getQuantidadeObjetos();
	}
}
