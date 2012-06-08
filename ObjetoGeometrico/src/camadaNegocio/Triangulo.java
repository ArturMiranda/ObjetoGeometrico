package camadaNegocio;

import classesExceptions.MedidaException;

public class Triangulo implements InterfaceOBJG {

	private final String nome = "Triângulo";
	private float aresta1;
	private float aresta2;
	private float aresta3;
	
	public Triangulo() {}
	
	public Triangulo(float aresta1, float aresta2, float aresta3) {
		this.aresta1 = aresta1;
		this.aresta2 = aresta2;
		this.aresta3 = aresta3;
	}
	
	public float area() throws MedidaException {
		if( getAresta1() > 0 && getAresta2() > 0) {
			return (float)((getAresta1()*getAresta2())/2.0);
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}

	public float perimetro() throws MedidaException {
		if( getAresta1() > 0 && getAresta2() > 0 && getAresta3() > 0 ) {
			return (getAresta1()+getAresta2()+getAresta3());
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}

	public float getAresta1() {
		return aresta1;
	}

	public void setAresta1(float aresta1) {
		this.aresta1 = aresta1;
	}

	public float getAresta2() {
		return aresta2;
	}

	public void setAresta2(float aresta2) {
		this.aresta2 = aresta2;
	}

	public float getAresta3() {
		return aresta3;
	}

	public void setAresta3(float aresta3) {
		this.aresta3 = aresta3;
	}

	public String getNome() {
		return nome;
	}
}
