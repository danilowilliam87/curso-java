package fundamentos.variaveis;

public class PromocaoECoercao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 3;
        long l = 12;
        float f = 1.25f;
        double d = 2.25;
        
        var res = (i + l) * f / d;
        
        System.out.println(res);
	}

}
