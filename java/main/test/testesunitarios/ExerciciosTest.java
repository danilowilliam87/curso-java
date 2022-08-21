package testesunitarios;

import org.junit.Assert;
import org.junit.Test;

import fundamentos.exercicios.Exercicios;

public class ExerciciosTest {

	Exercicios exercicios = new Exercicios();

	@Test
	public void helloWorldTest() {
		Assert.assertEquals("Hello World!", exercicios.helloWorld());
	}
	
	@Test
	public void somarTest() {
		Assert.assertEquals(10, exercicios.somar(5, 5));
	}
	
	
	@Test
	public void calcularMediaTest() {
		Assert.assertEquals(5.0, exercicios.calcularMedia(5.0, 5.0, 5.0, 5.0), 0.1);
	}
	
	@Test
	public void converterMedidaTest() {
		Assert.assertEquals(1000, exercicios.converterMedida(10));
	}
	
	@Test
	public void calcularRaioTeste() {
		Assert.assertEquals(314.16, exercicios.calcularRaio(10.0), 0.1);
	}
	
	@Test
	public void calcularDobroQuadrado() {
		Assert.assertEquals(10000.00, exercicios.calcularDobroQuadrado(10.0), 0.1);
	}
	
	@Test
	public void calcularSalarioTest() {
		Assert.assertEquals(800.00, exercicios.calcularSalario(10.0, 80.0), 0.1);
	}
	
	@Test
	public void converterParaCelsiusTest() {
		Assert.assertEquals(-6.6, exercicios.converterParaCelsius(20.0), 0.1);
	}
	
	@Test
	public void converterParafarenheitTest() {
		Assert.assertEquals(42.8, exercicios.converterParaFarenheit(6.0), 0.1);
	}
	
	@Test
	public void operacoesMatematicasTest() {
		Assert.assertEquals(200, exercicios.calcularProduto(10, 20));
	}
	
	@Test
	public void somarDoisNumerosTest() {
		Assert.assertEquals(90, exercicios.calcularTriplo(10, 20));
	}
	
	@Test
	public void elevarAoCuboTest() {
		Assert.assertEquals(1000, exercicios.calcularCubo(10));
	}
	
	@Test
	public void calcularPesoIdealTest() {
		Assert.assertEquals(74.3, exercicios.calcularPesoIdeal(1.82), 0.1);
	}
	
	@Test
	public void calcularPesoIdeal2Test() {
		Assert.assertEquals(74.3, exercicios.calcularPesoIdeal(1.82, "masculino"), 0.1);
	}
	
	@Test
	public void calcularPesoIdeal3Test() {
		Assert.assertEquals(68.3, exercicios.calcularPesoIdeal(1.82, "feminino"), 0.1);
	}
	
	@Test
	public void estaAcimaDoPesoTest() {
	    Assert.assertEquals("Você não está no peso ideal", exercicios.calcularPesoIdeal(120.00f, 1.82, "masculino"));	
	}
	
	@Test
	public void estaAcimaDoPesoTest2() {
	    Assert.assertEquals("Você está no peso ideal", exercicios.calcularPesoIdeal(74.3f, 1.82, "masculino"));	
	}
	
	@Test
	public void estaAcimaDoPesoTest3() {
	    Assert.assertEquals("Você não está no peso ideal", exercicios.calcularPesoIdeal(120.00f, 1.82, "feminino"));	
	}
	
	@Test
	public void estaAcimaDoPesoTest4() {
	    Assert.assertEquals("Você está no peso ideal", exercicios.calcularPesoIdeal(68.3f, 1.82, "feminino"));	
	}
	
	

}
