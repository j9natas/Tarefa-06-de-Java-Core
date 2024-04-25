package JAVA_06;

import java.util.Scanner;

public class TRES_VALORES05 {

	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();
        
        System.out.println("Digite o valor de C: ");
        double C = scanner.nextDouble();
        
       
        if (A == 0) {
            System.out.println("A equação não é do segundo grau. O valor de A deve ser diferente de zero.");
        } else {
          
            double discriminante = B * B - 4 * A * C;
            
         
            if (discriminante >= 0) {
              
                double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                
              
                System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
            } else {
                System.out.println("Não é possível calcular as raízes. Discriminante negativo.");
            }
        }
        
        
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

