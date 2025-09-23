import javax.swing.*;

public class ArraysPractice2 {

    public static void main(String[] args) {

        /*

        // Example Arrays
        String[] countries = {"España", "Argentina", "Venezuela", "Italia", "Estados Unidos", "Colombia", "Brasil", "Suiza" };

        // For-Each Loop
        for (String country: countries) {
            System.out.println("País: " + country);

         */


        // Exercise Countries
        String[] countries = new String[8];

        for (int i = 0; i < countries.length; i++) {
            countries[i] = JOptionPane.showInputDialog("Ingresa el país nro: " + (i + 1));
        }

        for (String country : countries) {
            System.out.println("País: " + country);
        }


        // Exercise Random Numbers
        int[] randomNumbers = new int[200];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) ((Math.random() * 1000) + 1);
        }

        for (int number : randomNumbers) {
            System.out.println("Número aleatorio: " + number);
        }
    }
}
