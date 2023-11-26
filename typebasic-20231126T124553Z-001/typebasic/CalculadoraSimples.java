package typebasic;
import java.util.Scanner;

public class CalculadoraSimples {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        double n1, n2, resultado;
	        int escolha;

	        System.out.println("Digite o primeiro número: ");
	        n1 = sc.nextDouble();

	        System.out.println("Digite o segundo número: ");
	        n2 = sc.nextDouble();

	        System.out.println("Escolha a operação:");
	        System.out.println("1. Adição");
	        System.out.println("2. Subtração");
	        System.out.println("3. Multiplicação");
	        System.out.println("4. Divisão");

	        System.out.println("Digite o número da operação desejada: ");
	        escolha = sc.nextInt();

	        resultado = 0;
	        switch (escolha) {
	            case 1:
	                resultado = n1 + n2;
	                break;
	            case 2:
	                resultado = n1 - n2;
	                break;
	            case 3:
	                resultado = n1 * n2;
	                break;
	            case 4:
	                if (n2 != 0) {
	                    resultado = n1 / n2;
	                } else {
	                    System.out.println("Erro: Divisão por zero.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Opção inválida.");
	                return;
	        }

	        System.out.println("Resultado: "+ resultado);
	    }
	}
