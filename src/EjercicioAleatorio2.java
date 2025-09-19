import java.util.Scanner;

public class EjercicioAleatorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio explicado por el tutor
		int randomNumber = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		int userNumber = 0;

		while (randomNumber != userNumber) {
			System.out.println("Introduce un numero entre 1 y 100");
			userNumber = scanner.nextInt();
			
			if(randomNumber>userNumber) System.out.println("Mas alto");
			else if(randomNumber<userNumber) System.out.println("Mas bajo");
			
			attempts++;
		}
		
		System.out.println("Correcto, hiciste: " + attempts + " intentos.");
		scanner.close();

	}

}
