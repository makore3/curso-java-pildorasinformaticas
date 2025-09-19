import javax.swing.*;

public class ForPractice {

    public static void main(String[] args) {

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Pepe " + (i+1));
        }
        */

        String mail = JOptionPane.showInputDialog("Introduce tu email:");

        boolean at = false;

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                at = true;
                break;
            }
        }

        if (at) {
            System.out.println("Email correcto");
        } else {
            System.out.println("Email incorrecto");
        }
    }
}
