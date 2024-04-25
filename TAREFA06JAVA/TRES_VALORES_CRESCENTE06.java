package JAVA_06;

import java.util.Arrays;
import java.util.Scanner;

public class TRES_VALORES_CRESCENTE06 {

	
	
	
	
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();
        
        System.out.println("Digite o valor de C: ");
        int C = scanner.nextInt();
        
        
        int[] valores = {A, B, C};
        Arrays.sort(valores);
      
        System.out.println("Os valores em ordem crescente são: ");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }
        
        
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

