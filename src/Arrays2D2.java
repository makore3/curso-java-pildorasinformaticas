import javax.swing.*;

public class Arrays2D2 {

    public static void main(String[] args) {

        // Personal Practice
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monton a depositar"));
        int years = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de años a invertir"));
        double interestRate = 0.10, totalInterest = 0, totalAmount = amount;

        double[][] calculator = new double[5][years+1];

        for (int i=0; i<calculator.length; i++) {
            calculator[i][0] = amount;
            for (int j = 1; j<calculator[i].length; j++) {
               totalAmount += totalInterest;
               totalInterest = totalAmount*interestRate;
               calculator[i][j] = totalAmount+totalInterest;
           }
           interestRate += 0.01;
           totalAmount = amount;
           totalInterest = 0;
        }

        for (double [] fila: calculator) {
            for (double colum : fila) {
               System.out.printf("%1.2f", colum);
                System.out.print(" ");
           }
           System.out.println();
        }

        /*
        // Tutorial Example
        double acumulado;
        double interes=0.10;

        double[][] saldo=new double [6][5];

        for (int i=0;i<6;i++) {
            saldo[i][0]=10000;
            acumulado = 10000;
            for (int j=1;j<5;j++) {
                acumulado=acumulado+(acumulado*interes);
                saldo[i][j] = acumulado;
            }
            interes=interes+0.01;
        }

        for (int z=0; z<6;z++) {
            for (int h=0;h<5;h++) {
                System.out.printf("%1.2f", saldo[z][h]);
                System.out.print(" ");
            }
            System.out.println();
        }

         */

    }
}
