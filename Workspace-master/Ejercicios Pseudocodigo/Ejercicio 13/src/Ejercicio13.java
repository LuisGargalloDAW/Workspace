import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int contadivisor = 0;
		int posibleprimo;
		boolean encontrar = false;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		a = teclado.nextInt();
		
		while ( a <= 0 ){
			System.out.println("El numero debe ser positivo");
			System.out.println("Ingrese numero: ");
			a = teclado.nextInt();
		}//while
		
		posibleprimo = a;
		
		
		while ( encontrar  == false ) {
			posibleprimo++; // NUMERO QUE HAY QUE AVERIGUAR SI ES PRIMO
			contadivisor= 0;
			for (int k = 2; k < posibleprimo; k++) { // vamos probando divisores
				if ( posibleprimo % k == 0 ) {
					contadivisor++; // contamos divisor
				}//if
			}//for
			
			if (contadivisor == 0){
				encontrar = true;
			}//if
		}//while
		
		if (encontrar == true){
			System.out.println("el primo mas cercano a "+ a + " es: " + posibleprimo);		
		}else{
			System.out.println("No se ha encontrado ningun numero primo por debajo del indicado");
		}
	}//MAIN
	

}//CLASS