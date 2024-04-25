package JAVA_06;

import java.util.Scanner;

public class VALORES_INTEIROS01 {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	     
	        System.out.println("Digite o primeiro valor: ");
	        int valor1 = scanner.nextInt();
	        
	        System.out.println("Digite o segundo valor: ");
	        int valor2 = scanner.nextInt();
	        
	 
	        int maiorValor = Math.max(valor1, valor2);
	        int menorValor = Math.min(valor1, valor2);
	        
	      
	        int diferenca = maiorValor - menorValor;
	        
	        
	        System.out.println("A diferença do maior pelo menor valor é: " + diferenca);
	        
	      
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

