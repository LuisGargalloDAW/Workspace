import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int suma = 0;
		int conta = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a = teclado.nextInt();
		
		while (a != 0){
			System.out.println("Ingrese el primer valor: ");
			a = teclado.nextInt();	
			conta = conta + 1;
			if (a % 5 == 0){
				suma = suma + a;			
			}//finsi
		}//finwhile
		
		System.out.println("la suma de los multiplos de cinco es: " + suma );	
		System.out.println("el numero de numeros introducidos es: " + conta);
	}

}
