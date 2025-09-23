import javax.swing.*;

public class ArrayPractice3 {

    public static void main(String[] args) {

        // Ejercicio explicado por el tutor

        // Ejemplo Países
        String[] paises = new String[9];

        for(int i=0; i<9; i++) {
            paises[i]= JOptionPane.showInputDialog("Introduce un país");
        }

        for(String elemento:paises) System.out.println("País: " + elemento);

        // Ejemplo Números Aleatorios
        int[] arraysAleatorios=new int[200];

        for(int i=0; i<arraysAleatorios.length; i++) {
            arraysAleatorios[i] = (int)(Math.random()*100);
        }

        for(int elem:arraysAleatorios) System.out.print(elem + " ");

    }
}
