package Github;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner ent = new Scanner(System.in);	
		int num=0;
		int res=1;
		
		System.out.println("Introduce un n�mero entero del 1 al 10");
		num = ent.nextInt();
	
		
		for(int i = num; i >= 1; i--) {
			
			res = res*i;
			
		}
		
		System.out.println("El factorial " + res);
		
		
	}

}
