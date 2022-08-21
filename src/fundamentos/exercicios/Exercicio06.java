package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("entre com o raio do círculo : ");
        double raio = scan.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("area = %.2f\n", area);
        scan.close();
	}

}
