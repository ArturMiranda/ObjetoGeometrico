package camadaNegocio;

import classesExceptions.MedidaException;

public class Retangulo extends Quadrilatero {

	private final String nome = "Retângulo";
	
	public Retangulo(){}
	
	public Retangulo(float aresta1) {
		super(aresta1);
	}
	
	public Retangulo(float aresta1, float aresta2) {
		super(aresta1,aresta2);
	}
	
	public float area() throws MedidaException {
		if( (getAresta1() > 0 && getAresta2() > 0) ) {
			return (getAresta1()*getAresta2());
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}
	public float perimetro() throws MedidaException {
		if( getAresta1() > 0 && getAresta2() > 0) {
			return (getAresta1()*2)+(2*getAresta2());
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}

	public String getNome() {
		return nome;
	}
}
