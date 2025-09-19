import java.util.*;

public class CondicionalIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce tu edad");
		Scanner entrada = new Scanner(System.in);
		int edad = entrada.nextInt();

		if (edad >= 18 && edad < 35)
			System.out.println("Eres mayor de edad");
		else if (edad >= 35)
			System.out.println("Todavia eres joven, no te preocupes por la edad");
		else
			System.out.println("No eres mayor de edad");

		entrada.close();

	}

}
