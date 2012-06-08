package classesTestes;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classesExceptions.QuantidadeException;

import camadaDados.RepositorioObjetoGeometrio;
import camadaNegocio.Circulo;
import camadaNegocio.Triangulo;

public class testeInsercao {
	
	RepositorioObjetoGeometrio repo;

	@Before
	public void setup() {
		repo = new RepositorioObjetoGeometrio();
	}
	
	@After
	public void setup1() {
		repo = null;
	}
	
	@Test
	public void testInserir1Objeto() throws QuantidadeException {
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAresta1((float)4);
		triangulo.setAresta2((float)3);
		triangulo.setAresta3((float)5);
		
		repo.inserir(triangulo);
		
		Assert.assertEquals(1, repo.getIndice());
	}

	@Test
	public void testInserir50Objetos() throws QuantidadeException {
		
		final int quantObjetos = 50; 
		int i;
		
		for(i=0; i<quantObjetos; i++){
			
			Circulo circulo = new Circulo();
			circulo.setRaio((float)5+i*2);
			
			repo.inserir(circulo);
			circulo = null;
		}
		
		
		Assert.assertEquals(quantObjetos, repo.getIndice());
	}
	
	@Test
	public void testInserir100Objetos() throws QuantidadeException {
		
		final int quantObjetos = 100;
		int i;
		
		for(i=0; i<quantObjetos; i++){
			
			Circulo circulo = new Circulo();
			circulo.setRaio((float)2+i);
			
			repo.inserir(circulo);
			circulo = null;
		}
		
		
		Assert.assertEquals(quantObjetos, repo.getIndice());
	}
	
	/* Teste feito para falhar, gera uma exceção pela quantidade de objetos excedida */
	@Test
	public void testInserir101Objetos() throws QuantidadeException {
		
		final int quantObjetos = 101;
		int i;
		
		for(i=0; i<quantObjetos; i++){
			
			Circulo circulo = new Circulo();
			circulo.setRaio((float)2+i);
			
			repo.inserir(circulo);
			circulo = null;
		}
		
		Assert.assertEquals(quantObjetos, repo.getIndice());
	}

}
