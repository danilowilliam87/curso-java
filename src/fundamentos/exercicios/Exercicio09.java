package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("entre com a temperatura em farenheit : ");
        float farenheit = scanner.nextFloat();
        int celsius = (int) (5 * (farenheit - 32) / 9);
        System.out.printf(" %d C°\n", celsius);
        
        scanner.close();
	}

}
