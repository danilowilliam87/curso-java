package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com os metros : ");
        double metros = scan.nextDouble();
        
        double centimetros =  metros * 100;
        System.out.println("metros = " + metros + " -> centimetros = " + centimetros);
        scan.close();
	}

}
