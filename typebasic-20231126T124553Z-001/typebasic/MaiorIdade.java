package typebasic;
import java.util.Scanner;

public class MaiorIdade {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int anonasc, idade, anoatual;
		System.out.println("Digite o ano de nascimento: ");
		anonasc = sc.nextInt();
		System.out.println("Digite o ano atual: ");
		anoatual = sc.nextInt();
		idade = anoatual - anonasc;
		System.out.println("Idade: " +idade);
		if (idade >= 18) {
			System.out.println("Maior de idade");
		}
		else {
			System.out.println("Menor de idade");
		}
	}
}

