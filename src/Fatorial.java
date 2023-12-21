import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner leitor= new java.util.Scanner(System.in);
		
		int numero_digitado= 0;
		int fatorial=1;
		System.out.println("Digite um número que deseja obter o fatorial");
		numero_digitado =leitor.nextInt();
		
		for( int i= 1; i <=numero_digitado; i++) {
		fatorial *= i;	
		
	} 
		System.out.println(fatorial);
	}
}
