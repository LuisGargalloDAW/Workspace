import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int conta = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a = teclado.nextInt();
		
		for (int k = 2; k <= a-1; k++){
			if (a % k == 0){
				conta = conta + 1;
			}//Finsi
		}//Fin para
		
		if ( conta != 0 ){
			System.out.println("El numero no es primo");
		}else{
			System.out.println("El numero  es primo");
		}//finelse
		
		}

}
