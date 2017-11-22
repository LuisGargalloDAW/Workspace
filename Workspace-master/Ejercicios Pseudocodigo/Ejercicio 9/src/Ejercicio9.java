import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int max;
		int min;
		int suma = 0 ;
		int conta = 0 ;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		a = teclado.nextInt();
		max = a;
		min = a;
		
		while ( a != 0 ){
			conta++;
			suma = suma + a;
			if (a > max){
				max = a;
			}else {
				if (a < min ){
					min = a;
				}//if
			}//else
			System.out.println("Ingrese numero: ");
			a = teclado.nextInt();
		}//while
		
		System.out.println("La media es :" + suma/conta);
		System.out.println("El maximo es :" + max + " y el minimo es : " + min);
	}

}
