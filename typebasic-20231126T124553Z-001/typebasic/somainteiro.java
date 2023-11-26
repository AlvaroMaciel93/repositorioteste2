package typebasic;
import java.util.Scanner;

public class somainteiro {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2, soma;
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("Soma dos números: " +soma);
	}

}
