package typebasic;
import java.util.Scanner;

public class trocadevariaveis {
	public static void main (String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = sc.nextInt();
		c = b;
		b = a;
		System.out.println("Valor de a trocado: "+c);
		System.out.println("Valor de b trocado: "+b);
	}

}
