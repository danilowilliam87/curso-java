package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0, nota4 = 0.0;
        
        System.out.print("entre com as 4 notas separadas por espaços : ");
        String notas = scan.nextLine();
        String[] notas2 = notas.split(" ");
        
        nota1 = Double.parseDouble(notas2[0]);
        nota2 = Double.parseDouble(notas2[1]);
        nota3 = Double.parseDouble(notas2[2]);
        nota4 = Double.parseDouble(notas2[3]);
        
        double media = (nota1 + nota2 + nota3 + nota4) / notas2.length;
        System.out.println("Média = " + media);
	}

}
