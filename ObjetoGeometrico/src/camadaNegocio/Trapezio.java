package camadaNegocio;

import classesExceptions.MedidaException;

public class Trapezio extends Quadrilatero {

	private final String nome = "Trapézio";
	
	public Trapezio() {}
	
	public Trapezio(float aresta1, float aresta2, float aresta3, float aresta4) {
		super(aresta1, aresta2, aresta3, aresta4);
	}

	public float area() throws MedidaException {
		if( (getAresta1() > 0 && getAresta2() > 0) ) {
			return (getAresta1()*getAresta2()/2);
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}
	public float perimetro() throws MedidaException {
		if( getAresta1() > 0 && getAresta2() > 0) {
			return (getAresta1()+getAresta2()+getAresta3()+getAresta4());
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}

	public String getNome() {
		return nome;
	}
}
