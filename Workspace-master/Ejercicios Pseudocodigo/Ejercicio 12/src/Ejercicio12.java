import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int sumaDivisores;
		

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		a = teclado.nextInt();
		
		while ( a <= 0 ){
			System.out.println("El numero debe ser positivo");
			System.out.println("Ingrese numero: ");
			a = teclado.nextInt();
		}//while
		
		sumaDivisores = 0;
		
		for (int k = 1; k < a ; k++ ){
			if ( a % k == 0){
				sumaDivisores = sumaDivisores + k;
			}//if
		}//for
		
		if (sumaDivisores == a){
			System.out.println("el numero introducido es perfecto");
		}else{
			System.out.println("el numero introducido no es perfecto");
		}//finelse y fin si
		
	}

}
