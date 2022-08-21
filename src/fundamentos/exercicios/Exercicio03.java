package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.print("digite o primeiro numero : ");
        int num1 = scan.nextInt();
        
        System.out.print("digite o segundo numero : ");
        int num2 = scan.nextInt();
        
        int soma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + soma);
        
        scan.close();
	}

}
