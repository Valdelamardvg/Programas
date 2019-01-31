package ejemplos_id;

import java.util.Scanner;

public class Programa_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		int n=0,i,suma=0;
		String res;
		System.out.print("que numero quieres?");
		
		
		n=leer.nextInt();
		do {
			
		
		for (i=0;i<n;i++) {
			
		suma=0+2;	
		n++;	
		}
		
		System.out.print("desea otra suma?(si/no)");
		res=leer.next();
		}while(res=="si");
		
	}

}
