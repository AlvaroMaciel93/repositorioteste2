package typebasic;
import java.util.Scanner;

public class mediaponderada {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, nota3;
		float peso1, peso2, peso3;
		float mediapond;
		
		System.out.println("Nota 1: ");
		nota1 = sc.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = sc.nextFloat();
		System.out.println("Nota 3: ");
		nota3 = sc.nextFloat();
		
		System.out.println("Peso da nota 1: ");
		peso1 = sc.nextFloat();
		System.out.println("Peso da nota 2: ");
		peso2 = sc.nextFloat();
		System.out.println("Peso da nota 3: ");
		peso3 = sc.nextFloat();
		
		mediapond = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		System.out.println("Média ponderada: " +mediapond);
		
	}

}
