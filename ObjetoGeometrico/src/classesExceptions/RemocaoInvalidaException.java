package classesExceptions;

public class RemocaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public RemocaoInvalidaException () {
		super("ERRO! N�O FOI POSS�VEL REMOVER O OBJETO !");
	}
}
