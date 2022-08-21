package fundamentos;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * https://pt.tutorialcup.com/java/how-to-limit-decimal-places-in-java.htm#:~:text=round()%20m%C3%A9todo%20%C3%A9%20outro,1000.0%20e%20assim%20por%20diante.
 * 
 * */
public class Teste {
	
	private static void truncar(Double valor) {
        System.out.println( valor );
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        System.out.println( decimalFormat.format(valor) );
        
        System.out.println(decimalFormat.format(valor).getClass());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double n = 123.4567;
		System.out.println("Original value: " + n);
		// limitar numero pra uma casa decimal
		Double d = (double) (Math.round(n * 10.0) / 10.0);
		System.out.println(d);

		// limitar para duas casas decimais

		d = (double) (Math.round(n * 100.0) / 100.0);
		System.out.println(d);
		
		//limitar para tres casas decimais
		d = (double) (Math.round(n*1000.0)/1000.0);
	    System.out.println(d);
	    
	    
	    System.out.println("#################################    Truncar    ##############################################################");
	    truncar(25.356);
	    
	}

}
