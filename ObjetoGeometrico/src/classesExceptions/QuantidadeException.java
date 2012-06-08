package classesExceptions;

public class QuantidadeException extends Exception {

	private static final long serialVersionUID = 1L;
	private int indice;
	
	public QuantidadeException(int indice) {
		super("QUANTIDADE DE OBJETOS EXCEDIDA, " + indice + " !");
		setIndice(indice);
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
}