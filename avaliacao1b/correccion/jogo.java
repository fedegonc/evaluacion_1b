
package avaliacao1b.correccion;


import java.util.InputMismatchException;
import java.util.Scanner;

public class jogo {
     
	public static void main(String[] args) {
		metodo();
	}
	public static void metodo() {
		
		int numero = (int)(Math.random()*100);
		System.out.println(numero);
		int tentativas=0, chute =0;
		boolean acerto= false, avancar=false;
		while(!acerto) {
			avancar=false;
			while(!avancar) {
				try {
					System.out.println("Chute:");
					chute=new Scanner(System.in).nextInt();
					avancar=true;
					
				}
				catch(InputMismatchException e) {
					System.out.println("Informe um numero");
				}
			}
			tentativas++;
			if(chute==numero) {
				acerto=true;
				System.out.println("Você acertou! Parabéns!");
				System.out.println("Tentativas:"+tentativas);	
			}
			else {
				if(chute>numero)
					System.out.println("Errou! O número é menor que"+chute+"!");
				else
					System.out.println("Errou! O número é maior que " + chute+"!");
			}
			
		}
		
	}
	

}
