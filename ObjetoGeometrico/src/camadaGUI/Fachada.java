package camadaGUI;

import classesExceptions.MedidaException;
import classesExceptions.QuantidadeException;
import classesExceptions.RemocaoInvalidaException;
import camadaDados.InterfaceRepositorioOBJG;
import camadaDados.RepositorioObjetoGeometrio;
import camadaNegocio.InterfaceOBJG;

public class Fachada {
	
	private CadastraOBJG cadastraObjeto;

    private static Fachada instancia;
    
    private Fachada() {
            initCadastros();
    }

    private void initCadastros() {
    	
    	InterfaceRepositorioOBJG repoObjeto = new RepositorioObjetoGeometrio();
    	
    	cadastraObjeto = new CadastraOBJG(repoObjeto);
    }

    public static Fachada obterInstancia() {

            if (instancia == null) {
                    instancia = new Fachada();
            }
            return instancia;
    }
    
    public void imprimir() throws MedidaException{
		cadastraObjeto.imprimir();
	}
    
    public void inserir(InterfaceOBJG objetoGeometrico) throws QuantidadeException {
		cadastraObjeto.inserir(objetoGeometrico);
	}
	
	public void removerPrimeiro() throws RemocaoInvalidaException {
		cadastraObjeto.removerPrimeiro();
	}
	
	public void removerUltimo() throws RemocaoInvalidaException {
		cadastraObjeto.removerUltimo();
	}
	
	public int getTamanhoCache() {
		return cadastraObjeto.getTamanhoCache();
	}
	
	public int getQuantidadeObjetos() {
		return cadastraObjeto.getQuantidadeObjetos();
	}
	
	public static Fachada getInstancia() {
		return instancia;
	}

	public static void setInstancia(Fachada instancia) {
		Fachada.instancia = instancia;
	}
}