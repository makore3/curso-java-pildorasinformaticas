import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "bosque", claveIntroducida = "";

		while (clave.equals(claveIntroducida) == false) {
			claveIntroducida = JOptionPane.showInputDialog("Introduce clave");

			if (clave.equals(claveIntroducida) == false)
				System.out.println("Clave Incorrecta");
		}
		System.out.println("Clave correcta");
	}

}
