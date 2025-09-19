import javax.swing.JOptionPane;

public class EjercicioAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userAttempts = 0, userGuess = 0;
		int randomNumber = (int)Math.round(Math.random() * 100);
		
		/*
		 * 
		
		// Option 1
		
		
		while ((userGuess == randomNumber) == false) {
			userGuess = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));

			if (userGuess < randomNumber)
				System.out.println("El numero secreto es mayor");
			else
				System.out.println("El numero secreto es menor");
			userAttempts++;
		}
		
		System.out.println("Felicidades! Haz adivinado el numero en: " + userAttempts + " intentos.");
		*/
		
		/*
		// Option 2
		for (; ; userAttempts++) {
			userGuess = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
			if (userGuess > randomNumber)
				JOptionPane.showMessageDialog(null, "El numero secreto es menor");
			else if (userGuess < randomNumber)
				JOptionPane.showMessageDialog(null, "El numero secreto es mayor");
		}
		*/

		// Option 3
		do {
			userGuess = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));

			if (userGuess > randomNumber)
				JOptionPane.showMessageDialog(null, "El numero secreto es menor");
			else if (userGuess < randomNumber)
				JOptionPane.showMessageDialog(null, "El numero secreto es mayor");
			userAttempts++;
		} while (userGuess != randomNumber);

		JOptionPane.showMessageDialog(null, "Felicidades! Haz adivinado el numero en: " + userAttempts + " intentos.");
		
	}

}
