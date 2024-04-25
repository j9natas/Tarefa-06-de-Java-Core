package JAVA_06;


import java.util.Scanner;


public class SEXO_DA_PESSOA12 {

	
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	      
	        System.out.println("Digite o nome da pessoa: ");
	        String nome = scanner.nextLine();
	        
	       
	        System.out.println("Digite o sexo da pessoa (M para masculino ou F para feminino): ");
	        char sexo = scanner.next().charAt(0);
	        
	       
	        if (sexo == 'M' || sexo == 'm') {
	            System.out.println("Ilmo Sr. " + nome);
	        } else if (sexo == 'F' || sexo == 'f') {
	            System.out.println("Ilma Sra. " + nome);
	        } else {
	            System.out.println("Sexo inválido.");
	        }
	        
	       
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

