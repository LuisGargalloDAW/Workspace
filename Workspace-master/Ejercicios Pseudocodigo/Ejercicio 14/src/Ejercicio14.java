import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int contadivisor = 0;
		int posibleprimo;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		a = teclado.nextInt();
		
		while ( a <= 0 ){
			System.out.println("El numero debe ser positivo");
			System.out.println("Ingrese numero: ");
			a = teclado.nextInt();
		}//while
		
		for (posibleprimo = 1; posibleprimo <= a; posibleprimo++){
			contadivisor = 0;
			for (int divisor = 2; divisor < posibleprimo; divisor++){
				if (posibleprimo % divisor == 0){
					contadivisor++;
				}//if
			}//segundofor
			if (contadivisor == 0){
				System.out.println(posibleprimo);
			}
		}//primerfor
	}

}
