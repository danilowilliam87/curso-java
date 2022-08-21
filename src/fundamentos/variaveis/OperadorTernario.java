package fundamentos.variaveis;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double a = 12.45, b = 12.4;
        
        double max = a > b ? a : b;
        double min = a < b ? a : b;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
	}

}
