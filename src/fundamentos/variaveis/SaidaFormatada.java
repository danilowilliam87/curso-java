package fundamentos.variaveis;

import java.util.Scanner;

public class SaidaFormatada {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in)) {
			System.out.print("No Final ? ");
			int limite = teclado.nextInt();
			int soma = 0;
			
			for(int i = 1; i<= limite; i++) {
				soma += i;
			}
			
			System.out.printf("Soma total = [0..%1d] = %2d%n", limite, soma);
			teclado.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

}
