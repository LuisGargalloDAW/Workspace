import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		long factorial;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		a = teclado.nextInt();
		
		while ( a < 0 ){
			System.out.println("El numero debe ser positivo");
			System.out.println("Ingrese numero: ");
			a = teclado.nextInt();
		}//while
		
		factorial = 1;
		
		for (int k = a; k >= 1; k-- ){
			factorial = factorial * k ;
		}//for
		
		System.out.println("el factorial del numero introducido es : " + factorial );
	}

}
