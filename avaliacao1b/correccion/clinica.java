
package avaliacao1b.correccion;



import java.util.InputMismatchException;
import java.util.Scanner;


public class clinica {
	

public static void main(String[] args) {
	metodo();
}
	public static void metodo() {
		System.out.println("Informe a quantidade de doadores:");
		int quantidade= new Scanner (System.in).nextInt();
		
		String[] nome= new String[quantidade];
		double[] peso=new double[quantidade];
		int[] idade = new int[quantidade];
		String[] sexo = new String[quantidade];
		String[] tipo =new String[quantidade];
		
		for (int i=0; i<quantidade;i++) {
			System.out.println("Informe");
			System.out.println("Nome:");
			nome[i]= new Scanner(System.in).nextLine();
			
			System.out.println("Sexo:");
			sexo[i]= new Scanner(System.in).nextLine();
			
			System.out.println("Tipo sanguineo:(A,B,AB, ou O)");
			tipo[i]=new Scanner(System.in).nextLine();
			
			boolean avancar=false;
			while(!avancar) {
				System.out.println("idade:");
				try {
					idade[i]=new Scanner(System.in).nextInt();
					avancar=true;		
				}
				catch(InputMismatchException e) {
					System.out.println("Informe idade apenas com números");
				}
			}
			
			avancar=false;
			while(!avancar) {
				System.out.println("Peso:");
				try {
					peso[i]=new Scanner(System.in).nextDouble();
					avancar=true;
				}
				catch(InputMismatchException e) {
					System.out.println("Informe peso apenas con números");
				}
			}
			System.out.println("Cadastrado");
			
		}
		System.out.println("____________________________");
		System.out.println("Doadores do tipo A:");
		for(int i=0; i<quantidade; i++) {
			if(tipo[i].equalsIgnoreCase("a")) {
				System.out.println("Doador:"+nome[i]);
				System.out.println("Idade:"+idade[i]);
				System.out.println("Sexo:"+sexo[i]);
				System.out.println("Peso:"+peso[i]);
			}
		}
		System.out.println("____________________________");
		System.out.println("Doadores do tipo O:");
		for(int i=0; i<quantidade; i++) {
			if(tipo[i].equalsIgnoreCase("o")) {
				System.out.println("Doador;"+nome[i]);
				System.out.println("Idade:"+idade[i]);
				System.out.println("Sexo:"+sexo[i]);
				System.out.println("Peso:"+peso[i]);
			}
		}
		System.out.println("____________________________");
		System.out.println("Doadores do tipo B:");
		for(int i=0; i<quantidade; i++) {
			if(tipo[i].equalsIgnoreCase("b")) {
				System.out.println("Doador;"+nome[i]);
				System.out.println("Idade:"+idade[i]);
				System.out.println("Sexo:"+sexo[i]);
				System.out.println("Peso:"+peso[i]);
	}

}
		System.out.println("____________________________");
		System.out.println("Doadores do tipo AB:");
		for(int i=0; i<quantidade ; i++) {
			if(tipo[i].equalsIgnoreCase("ab")) {
				System.out.println("Doador;"+nome[i]);
				System.out.println("Idade:"+idade[i]);
				System.out.println("Sexo:"+sexo[i]);
				System.out.println("Peso:"+peso[i]);
			}
		}
	}
}






























