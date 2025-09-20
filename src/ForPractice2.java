import javax.swing.*;
import java.math.BigInteger;

public class ForPractice2 {

    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        BigInteger bigNumber = BigInteger.valueOf(number);

        for (BigInteger i = BigInteger.ONE; i.compareTo(bigNumber) <= 0; i = i.add(BigInteger.ONE)) {
            factorial = factorial.multiply(i);
        }

        System.out.println("El factorial de " + number + " es: " + factorial);
    }
}
