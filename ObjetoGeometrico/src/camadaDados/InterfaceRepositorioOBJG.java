package camadaDados;

import classesExceptions.MedidaException;
import classesExceptions.QuantidadeException;
import classesExceptions.RemocaoInvalidaException;
import camadaNegocio.InterfaceOBJG;

public interface InterfaceRepositorioOBJG {

	public void inserir(InterfaceOBJG objetoGeometrico) throws QuantidadeException;
	
	public void imprimir() throws MedidaException;
	
	public void removerPrimeiro() throws RemocaoInvalidaException;
	
	public void removerUltimo() throws RemocaoInvalidaException;
	
	public int getTamanhoCache();
	
	public int getQuantidadeObjetos();

}
