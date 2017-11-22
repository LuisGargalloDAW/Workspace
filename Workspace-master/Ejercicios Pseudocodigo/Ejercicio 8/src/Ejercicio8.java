import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b; 
		int conta1 = 0;
		int conta2 = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a = teclado.nextInt();
		
		while (a < 0 ){
			System.out.println("Error debes introducir un numero positivo");
			System.out.println("Ingrese el primer valor: ");
			a = teclado.nextInt();
		}//while
		System.out.println("Ingrese el segundo valor: ");
		b = teclado.nextInt();
		
		while ( b < 0 ){
			System.out.println("Error debes introducir un numero positivo");
			System.out.println("Ingrese el segundo valor: ");
			b = teclado.nextInt();
		}//while
		
		for (int k = 1; k <= a; k++){
			if ( a % k ==0 ){
				conta1++;			
			}//if	
		}//for
		
		for (int z = 1; z <= b; z++){
			if ( b % z ==0 ){
				conta2++;			
			}//if
		}//for
		
		if (conta1 > conta2){
			System.out.println( a + " tiene mas divisores que " + b);
		} else{
			System.out.println( b +  " tiene mas divisores que " + a);
		}
	}

}
