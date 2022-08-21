package fundamentos.exercicios;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;

public class Exercicios {

	public Object helloWorld() {
		return "Hello World!";
	}

	public int somar(int i, int j) {
		return i + j;
	}

	public double calcularMedia(double d, double e, double f, double g) {
		return (d + e + f + g) / 4;
	}

	public int converterMedida(int i) {
		return i * 100;
	}

	public double calcularRaio(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}

	public double calcularDobroQuadrado(double lado) {
		float area = (float) Math.pow(lado, 2);
		return Math.pow(area, 2);
	}

	public double calcularSalario(double valorHora, double totalHorasTrabalhadas) {
		return valorHora * totalHorasTrabalhadas;
	}

	public double converterParaCelsius(double farenheit) {
		return (5 * (farenheit - 32) / 9);
	}

	public double converterParaFarenheit(double celsius) {
		return (celsius * 1.8) + 32;
	}

	public int calcularProduto(int i, int j) {
		return i * j;
	}

	public Object calcularTriplo(int i, int j) {
		return (i * 3) + (j * 3);
	}

	public int calcularCubo(int i) {
		return (int) Math.pow(i, 3);
	}

	public double calcularPesoIdeal(double altura) {
		return (72.7 * altura) - 58;
	}

	public double calcularPesoIdeal(double altura, String sexo) {
		double pesoIdeal = 0.0;
		switch (sexo) {
			case "masculino":
				pesoIdeal = (72.7 * altura) - 58;
				break;
			case "feminino":
				pesoIdeal = (62.1 * altura) - 44.7;
				break;
			default:
				pesoIdeal = 0.0;
				break;
		}
		return (pesoIdeal * 10.0) / 10.0;
	}
	
	
	public String calcularPesoIdeal(float peso, double altura, String sexo) {
		DecimalFormat format = new DecimalFormat("##.#");
		String resultado = format.format(calcularPesoIdeal(altura, sexo));
		String res = resultado.replace(",", ".");
		return res.equals(String.valueOf(peso))? "Você está no peso ideal" : "Você não está no peso ideal";
		
	}

	public String informarImc(double peso, double altura, String sexo) {
		return peso == calcularPesoIdeal(altura, sexo) ? "Você está no peso ideal" : "Você não está no peso ideal";
	}

}
