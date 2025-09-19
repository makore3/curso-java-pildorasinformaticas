import java.util.Scanner;

public class UsoSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce dia de la semana");

		String diaSemana = entrada.nextLine();

		String resultado = switch (diaSemana.toLowerCase()) {
		case "lunes", "martes", "miercoles", "jueves", "viernes" -> "Laborable";
		case "sabado", "domingo" -> "Festivo";
		default -> "Dia incorrecto";
		};

		System.out.println(resultado);

		entrada.close();
	}

}
