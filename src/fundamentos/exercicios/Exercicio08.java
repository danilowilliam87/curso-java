package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        System.out.print("entre com o seu valor da hora em R$ : ");
        float valorHora = scan.nextFloat();
        
        System.out.print("entre com o total de horas trabalhadas  : ");
        int horasTrabalhadas  = scan.nextInt();
        
        float salario = valorHora * horasTrabalhadas;
        System.out.printf("Salário R$ : %.2f\n", salario);
        
        scan.close();
	}

}
