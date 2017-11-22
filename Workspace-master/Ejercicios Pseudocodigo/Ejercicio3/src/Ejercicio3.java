import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a = teclado.nextInt();
		
		while (a < 0 || a > 101){
			System.out.println("Ingrese el primer valor entre 1 y 100: ");
			a = teclado.nextInt();
		}	//while
			
		for (int k = 1; k <= 10; k++){
			System.out.println(a + "x" + k + "=" + a*k);
		}
		}

}
