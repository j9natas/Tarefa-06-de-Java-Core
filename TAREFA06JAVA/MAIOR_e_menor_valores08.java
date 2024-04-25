package JAVA_06;

import java.util.Scanner;


public class MAIOR_e_menor_valores08 {

	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "º número inteiro: ");
            int numero = scanner.nextInt();
            
       
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        
      
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        
       
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

