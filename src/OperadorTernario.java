import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad=entrada.nextInt();		
		
		/*
		if(edad<18) System.out.println("Eres menor de edad");
		
		else System.out.println("Eres mayor de edad");
		*/
		
		// condicion ? true : false
		String resultado=(edad<18)? "Eres menor de edad":"Eres mayor de edad";
		
		System.out.println(resultado);
		
	}

}
