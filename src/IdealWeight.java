import javax.swing.JOptionPane;

public class IdealWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		// Solucion personal
		int height, idealWeight;
		String gender;

		JOptionPane.showMessageDialog(null,"Inicializacion: Calculadora de Peso Ideal");

		height = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en cm"));

		do {
			gender = JOptionPane.showInputDialog("Ingresa tu sexo (M/F)");

		} while (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F"));

		if (gender.equalsIgnoreCase("M")) {
			idealWeight = height - 110;
		} else {
			idealWeight = height - 120;
		}

		JOptionPane.showMessageDialog(null, "Tu peso ideal es de: " + idealWeight + " kg.");
		
		*/
		
		// Solucion del tutor
		String genero="";
		int pesoIdeal=0;
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu genero (M/F)");
			
		} while (genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("F")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		if(genero.equalsIgnoreCase("M")) pesoIdeal=altura-110;
		else if(genero.equalsIgnoreCase("F")) pesoIdeal=altura-120;
		
		JOptionPane.showMessageDialog(null, "Tu peso ideal es: " + pesoIdeal + " kg.");
		
		
	}

}
