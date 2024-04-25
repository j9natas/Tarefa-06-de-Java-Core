package JAVA_06;

import java.util.Scanner;

public class NOTAS_ESCOLARES03 {

		

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        
     
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        
        if (media >= 5.0) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else {
            System.out.println("O aluno não foi aprovado com média " + media);
        }
        
     
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
		
		
		
		
		
