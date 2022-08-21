package fundamentos.variaveis;

public class EscopoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 5;
        {
        	int j = 0;
        	System.out.println(i);
        	j = 5 * i;
        	System.out.println(j);
        	{
        		System.out.println(i);
        		System.out.println(j);
        	}
        }
        System.out.println(i);
        //System.out.println(j);
	}

}
