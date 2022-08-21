package fundamentos.variaveis;

public class OperadorBitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0x1F, b = 0x10;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a & b = " + (a & b));
		System.out.println("a | b = " + (a | b));
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("~ b = " + (~b));
		System.out.println("a << 2 = " + (a << 2));
		System.out.println("-a >> 4 = " + (-a >> 4));
		System.out.println("-a >>> 4 = " + (-a >>> 4));

		// bitwise com numeros inteiros
		int num1 = 10, num2 = 12;
		String num1Binary = Integer.toBinaryString(num1), 
				num2Binary = Integer.toBinaryString(num2);
		// 1110
		// 1010
		// OU
		// ____
		// 1110

		// 1010
		// 1100
		// E
		// ____
		// 1010
		
		System.out.println("num1 em binario = "+num1Binary);
		System.out.println("num2 em binario = "+num2Binary);
		System.out.println("(a | b) em binario = "+Integer.toBinaryString((a | b)));
		System.out.println("(a & b) em binario = "+Integer.toBinaryString((a & b)));
		System.out.println("(a ^ b) em binario = "+Integer.toBinaryString((a ^ b)));
		
		System.out.println(a + " | " + b + " = " + (a | b));
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));

	}

}
