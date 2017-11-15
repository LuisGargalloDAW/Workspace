import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		int suma = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a = teclado.nextInt();
		
		if ( a < 0 ){
			a = -a; 
		}//If
		for (b = 2; b <= a; b = b+2){
			suma = suma + b*b;
		}//for
		
		System.out.println("El resultado de la suma es: " + suma);
		
	}

}
