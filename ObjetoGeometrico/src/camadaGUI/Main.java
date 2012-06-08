package camadaGUI;

import classesExceptions.QuantidadeException;
import classesExceptions.RemocaoInvalidaException;
import camadaNegocio.Circulo;
import camadaNegocio.Quadrado;
import camadaNegocio.Retangulo;
import camadaNegocio.Triangulo;

public class Main {

	public static void main(String[] args) throws QuantidadeException, RemocaoInvalidaException {

		try{
			Fachada fachada = Fachada.obterInstancia();
			
			//for(int i = 0; i<26; i++){
				
			Triangulo triangulo = new Triangulo();
			triangulo.setAresta1((float)4);
			triangulo.setAresta2((float)3);
			triangulo.setAresta3((float)5);
			fachada.inserir(triangulo);
			
			Circulo circulo = new Circulo();
			circulo.setRaio((float)5);
			fachada.inserir(circulo);
			
			Quadrado quadrado = new Quadrado();
			quadrado.setAresta1((float)3);
			fachada.inserir(quadrado);
			
			Retangulo retangulo = new Retangulo();
			retangulo.setAresta1((float)3);
			retangulo.setAresta2((float)6);
			fachada.inserir(retangulo);
			
			//}
			System.out.println("Quantidade: "+fachada.getQuantidadeObjetos());
			
			//fachada.imprimir();
			
			fachada.removerPrimeiro();
			
			//fachada.removerUltimo();
			

			//fachada.imprimir();
			
		}catch( QuantidadeException quantObj ){
			quantObj.printStackTrace();
		}catch (RemocaoInvalidaException rem) {
			rem.printStackTrace();
		}
	}

}
