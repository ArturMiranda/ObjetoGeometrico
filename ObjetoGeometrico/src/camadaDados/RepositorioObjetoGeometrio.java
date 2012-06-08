package camadaDados;

import classesExceptions.MedidaException;
import classesExceptions.QuantidadeException;
import classesExceptions.RemocaoInvalidaException;
import camadaNegocio.Circulo;
import camadaNegocio.InterfaceOBJG;
import camadaNegocio.Quadrado;
import camadaNegocio.Retangulo;
import camadaNegocio.Trapezio;
import camadaNegocio.Triangulo;

public class RepositorioObjetoGeometrio implements InterfaceRepositorioOBJG{

	private InterfaceOBJG[] objetosGeometricos;
	private int indice;
	private static int tamanhoCache = 100;

	public RepositorioObjetoGeometrio() {
		this.objetosGeometricos = new InterfaceOBJG[tamanhoCache];
		this.indice = 0;
	}

	public void inserir(InterfaceOBJG objetoGeometrico) throws QuantidadeException{
		if( getIndice() < tamanhoCache ){
			objetosGeometricos[indice] = objetoGeometrico;
			setIndice(indice + 1);
		}
		else {
			QuantidadeException quantidadeExcediada;
			quantidadeExcediada = new QuantidadeException(getIndice()+1);
			throw quantidadeExcediada;
		}
	}

	public void imprimir() throws MedidaException{
		System.out.println("\n--------------------------------- IMPRESSAO FORMAS ------------------------------------------- ");
		for(int i=0; i< getIndice(); i++ ){

			if( objetosGeometricos[i] instanceof Quadrado ) {
				System.out.println("\nNome: "+ ((Quadrado)objetosGeometricos[i]).getNome());
				System.out.println("Área: "+ ((Quadrado)objetosGeometricos[i]).area());
				System.out.println("Perímetro: "+ ((Quadrado)objetosGeometricos[i]).perimetro());

			} else if( objetosGeometricos[i] instanceof Circulo ) {
				System.out.println("\nNome: "+ ((Circulo)objetosGeometricos[i]).getNome());
				System.out.println("Área: "+ ((Circulo)objetosGeometricos[i]).area());
				System.out.println("Perímetro: "+ ((Circulo)objetosGeometricos[i]).perimetro());

			} else if( objetosGeometricos[i] instanceof Retangulo ) {
				System.out.println("\nNome: "+ ((Retangulo)objetosGeometricos[i]).getNome());
				System.out.println("Área: "+ ((Retangulo)objetosGeometricos[i]).area());
				System.out.println("Perímetro: "+ ((Retangulo)objetosGeometricos[i]).perimetro());

			} else if( objetosGeometricos[i] instanceof Triangulo ) {
				System.out.println("\nNome: "+ ((Triangulo)objetosGeometricos[i]).getNome());
				System.out.println("Área: "+ ((Triangulo)objetosGeometricos[i]).area());
				System.out.println("Perímetro: "+ ((Triangulo)objetosGeometricos[i]).perimetro());

			} else if( objetosGeometricos[i] instanceof Trapezio ) {
				System.out.println("\nNome: "+ ((Trapezio)objetosGeometricos[i]).getNome());
				System.out.println("Área: "+ ((Trapezio)objetosGeometricos[i]).area());
				System.out.println("Perímetro: "+ ((Trapezio)objetosGeometricos[i]).perimetro());

			}
		}

	}

	public void removerPrimeiro() throws RemocaoInvalidaException {

		int i;

		if( getIndice() > 0 ) {
			for( i=0; i< getIndice(); i++ ) {
				objetosGeometricos[i] = objetosGeometricos[i+1];
			}
			objetosGeometricos[i] = null;
			setIndice( getIndice() - 1 );
		}
		else{
			RemocaoInvalidaException remocaoInvalidaException;
			remocaoInvalidaException = new RemocaoInvalidaException();
			throw remocaoInvalidaException;
		}
	}

	public void removerUltimo() throws RemocaoInvalidaException{

		if( getIndice() > 0 ){
			objetosGeometricos[indice-1] = null;
			setIndice( getIndice() - 1 );
		}
		else{
			RemocaoInvalidaException remocaoInvalidaException;
			remocaoInvalidaException = new RemocaoInvalidaException();
			throw remocaoInvalidaException;
		}
	} 

	public int getTamanhoCache() {
		return tamanhoCache;
	}

	public int getQuantidadeObjetos(){
		return getIndice();
	}

	public static void setTamanhoCache(int tamanhoCache) {
		RepositorioObjetoGeometrio.tamanhoCache = tamanhoCache;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

}