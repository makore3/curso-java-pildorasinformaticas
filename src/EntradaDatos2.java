import javax.swing.*;

public class EntradaDatos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		
		double salario=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario"));
		
		System.out.println("Te llamas " + nombre + " y tienes " + edad + " anos");
		
		System.out.println("Y el ano que viene tendras " + (edad+1));
		
		System.out.println("Y tu salario es de: " + salario + " EUR");

	}

}
