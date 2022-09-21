
package avaliacao1b.correccion;


import java.util.Scanner;

public class codificador {

	public static void main(String[] args) {
		metodo();
	}
	public static void metodo() {
		System.out.println("Informe a frase");
		String frase= new Scanner (System.in).nextLine();
		String[]palavras=frase.split(" ");
		
		while(!palavras[0].equalsIgnoreCase("exit")) {
			
			if(palavras[0].substring(0,3).equalsIgnoreCase("iay") ||
			palavras[0].substring(0,3).equalsIgnoreCase("uai")){
				
				for(String string: palavras) {
					
					if(string.substring(0,3).equalsIgnoreCase("uai"))
					{
						
				          System.out.print(string.substring(string.length()-2,string.length()));
				          System.out.print(string.substring(3,string.length()-2));
				          System.out.print(" ");
					}
					else {
						for(int i=string.length()-1; i>=3; i--)
							System.out.print(string.charAt(i));
						
						System.out.print(" ");
						
				}
					
			}
		}
			else {
				for(String string: palavras){
					
					if(string.charAt(0)=='a' || string.charAt(0)=='e' ||string.charAt(0)=='i'
							|| string.charAt(0)=='o'  || string.charAt(0)=='u') 
					{
						
						System.out.print("iay");
						for(int i=string.length()-1; i>=0; i--)
                            System.out.print(string.charAt(i));
						System.out.print(" ");
					}
						
				
		    else {
		    	System.out.print("uai");
		    	System.out.print(string.substring(2,string.length()));
		    	System.out.print(string.substring(0,2));
		    	System.out.print(" ");
		    	
		    }
		    	
		}		
		    	
	}    	
		 
				System.out.println();
				System.out.println("_____________________");
				System.out.println("Informe a frase");
				frase=new Scanner (System.in).nextLine();
				palavras=frase.split(" ");
	}

	}
}
			
			
	