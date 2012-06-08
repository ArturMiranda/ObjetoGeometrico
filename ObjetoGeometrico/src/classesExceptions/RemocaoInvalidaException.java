package classesExceptions;

public class RemocaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public RemocaoInvalidaException () {
		super("ERRO! NÃO FOI POSSÍVEL REMOVER O OBJETO !");
	}
}
