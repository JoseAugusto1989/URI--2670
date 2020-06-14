package exer2670;

import java.util.Scanner;

public class exercicio2670 {
	
	public static void main(String[]args) {
		
		 Scanner leitura = new Scanner(System.in);
		 
		 System.out.println("Digite quantas passoas trabalham no andar:");
		 int a = leitura.nextInt();
		 System.out.println("Digite quantas passoas trabalham no andar:");
		 int b = leitura.nextInt();
		 System.out.println("Digite quantas passoas trabalham no andar:");
		 int c = leitura.nextInt();
		 
		    int menor = 0;
			int maq1 = a * 0 + b * 2 + c * 4;
			int maq2 = a * 2 + b * 0 + c * 2;
			int maq3 = a * 4 + b * 2 + c * 0;
			
			if (maq1 <= maq2) {
               menor = maq1;
			} else {
				menor = maq2;
			} if (menor >= maq3) {
				menor = maq3;
			}    
			    System.out.println(menor);
		 
		 
		 leitura.close();
	}

}
