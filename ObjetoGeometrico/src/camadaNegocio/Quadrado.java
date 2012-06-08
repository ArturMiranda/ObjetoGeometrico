package camadaNegocio;

import classesExceptions.MedidaException;

public class Quadrado extends Retangulo {
	
	private final String nome = "Quadrado";
	
	public Quadrado() {
		super();
	}
	
	public Quadrado(float aresta1) {
		super(aresta1);
	}
	
	public float area() throws MedidaException {
		if( getAresta1() > 0 ) {
			return (getAresta1()*getAresta1());
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}
	public float perimetro() throws MedidaException {
		if( getAresta1() > 0 ) {
			return (4*getAresta1());
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}

	public String getNome() {
		return nome;
	}
}
