package typebasic;
import java.util.Scanner;

public class parouimpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.println("Digite um número inteiro: ");
		n1 = sc.nextInt();
		if (n1 % 2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
	}

}
