package typebasic;

import java.util.Scanner;

public class arearetangulo {
	public static void main(String[] args) {
		float base, altura, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor da base: ");
		base = sc.nextFloat();
		System.out.println("Insira o valor da altura: ");
		altura = sc.nextFloat();
		area = base * altura;
		System.out.println("Área do retângulo: "+area);
	}

}
