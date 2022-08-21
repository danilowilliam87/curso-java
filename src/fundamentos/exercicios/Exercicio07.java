package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("entre com o lado do quadrado : ");
        float lado = scan.nextFloat();
        
        float area = (float) Math.pow(lado, 2);
        System.out.printf("area² = %.2f\n", Math.pow(area, 2));
        
        scan.close();
	}

}
