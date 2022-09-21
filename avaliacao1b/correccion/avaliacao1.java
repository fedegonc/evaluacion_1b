package avaliacao1b.correccion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class avaliacao1 {

	public static void main(String[] args) {
		
		int varmenu=0;
		while(varmenu!=4) {
			
			Scanner input =new Scanner(System.in);
			System.out.println("1-Jogo de números");
			System.out.println("2-Clínica");
			System.out.println("3-Codificador");
			System.out.println("4-Encerrar");
			System.out.println();
			
			boolean avancar=false;
			while(!avancar) {
				try {
					input= new Scanner(System.in);
					varmenu= input.nextInt();
		            avancar= true;    
				}
				catch(InputMismatchException e) {
					System.out.println("Informe um numero");
				}
			}
				switch(varmenu) {
				case 1:
					jogo.metodo();
					System.out.println();
					
					break;
				case 2:
					clinica.metodo();
					
					break;
				case 3:
					codificador.metodo();
					System.out.println();
					
					break;
					
				}
			
		}

	}

}






























