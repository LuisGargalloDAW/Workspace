import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a = teclado.nextInt();
		
		if ( a < 0 ){
			a = -a; 
		}//if
		
		for (int k = 1; k <= a; k++){
			if (a % k == 0){
				System.out.println( k + " es divisor de " + a);
			}//if
		}//for
	}

}
