import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {

		int n1 = 0;
		int n2;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = input.nextInt();

		System.out.println("Soma : " + (n1 + n2));
		System.out.println("Subtra��o : " + (n1 - n2));
		System.out.println("Multiplica��o : " + (n1 * n2));
		System.out.println("Divis�o : " + (n1 / n2));

	}

}
