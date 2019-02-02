package Programasu1;

import java.util.Scanner;

public class Programa_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		int edad;
		String nombre="";
		double estatura;
		
		System.out.println("cual es su nombre: ");
		nombre=leer.nextLine();
		
		System.out.println("cual es su edad: ");
		edad=leer.nextInt();
		
		System.out.println("cual es su estatura: ");
		estatura=leer.nextDouble();
		
		
		System.out.println("nombre: "+nombre);
		System.out.println("edad: "+edad);
		System.out.println("estatura: "+estatura);
	}

}
