package camadaNegocio;

public abstract class Quadrilatero implements InterfaceOBJG {

	private float aresta1;
	private float aresta2;
	private float aresta3;
	private float aresta4;
	
	// Construtor vazio.
	public Quadrilatero() {}
	
	// Construtor de um Quadrado
	public Quadrilatero(float aresta1) {
		this(aresta1,0);
	}
	
	// Construtor de um Retângulo ou Trapézio Equilátero
	public Quadrilatero(float aresta1, float aresta2) {
		this(aresta1, aresta2, 0);
	}

	// Construtor de um Trapézio Isóceles
	public Quadrilatero(float aresta1, float aresta2, float aresta3) {
		this(aresta1, aresta2, aresta3, 0);
	}
	
	// Construtor de um Trapézio Escaleno
	public Quadrilatero(float aresta1, float aresta2, float aresta3, float aresta4) {
		this.aresta1 = aresta1;
		this.aresta2 = aresta2;
		this.aresta3 = aresta3;
		this.aresta4 = aresta4;
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

	public float getAresta4() {
		return aresta4;
	}

	public void setAresta4(float aresta4) {
		this.aresta4 = aresta4;
	}
}
