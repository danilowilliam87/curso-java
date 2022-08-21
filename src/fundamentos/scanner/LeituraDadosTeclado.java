package fundamentos.scanner;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			Scanner scan = new Scanner(System.in);
			//ler inteiro
			int idade = scan.nextInt();
			
			//ler String (toda a linha)
			String nome = scan.next();
			
			
			//ler double 
			double salario = scan.nextDouble();
			
			//ler float 
			float peso = scan.nextFloat();
			
			System.out.printf("idade = %d, nome = %s, %.2f salario, peso = %.2f\n", 
					idade, nome, salario, peso);
			
			scan.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

}
