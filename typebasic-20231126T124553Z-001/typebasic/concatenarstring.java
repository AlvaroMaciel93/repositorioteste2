package typebasic;
import java.util.Scanner;

public class concatenarstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.println("Digite um texto: ");
		s1 = sc.nextLine();
		System.out.println("Digite outro texto: ");
		s2 = sc.nextLine();
		System.out.println("Concatenação: "+s1+s2);
	}

}
