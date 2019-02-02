package Programasu1;

import java.util.Scanner;

public class Programa_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		int edad;
		
		System.out.println("cuantos años tiene: ");
		edad=leer.nextInt();
		
		if (edad>=18) {
			System.out.println("usted es mayor de edad");
		}else {
			System.out.println("usted es menor de edad");
		}
	}

}
