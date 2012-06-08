package camadaNegocio;

import classesExceptions.MedidaException;

public class Circulo implements InterfaceOBJG {

	private final String nome = "Círculo";
	private float raio;
	private static float PI = 3.14F;

	public Circulo() {}

	public Circulo(float raio) {
		this.raio = raio;
	}

	public float area() throws MedidaException {
		if(getRaio() > 0 ) {
			return (float)getPI()*getRaio()*getRaio();
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}

	public float perimetro() throws MedidaException{
		if(getRaio() > 0 ) {
			return (float)2*getPI()*getRaio();
		}
		else{
			throw new MedidaException("\nValor Invalido!");
		}
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public String getNome() {
		return nome;
	}

	public static float getPI() {
		return PI;
	}

	public static void setPI(float pI) {
		PI = pI;
	}
}
