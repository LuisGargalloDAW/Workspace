import java.util.Scanner;
public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a=teclado.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		b=teclado.nextInt();
		
		while (b < a) {
			System.out.println("Error. El segundo valor debe ser mayor al primero");
			System.out.println("Ingrese el segundo valor: ");
			b=teclado.nextInt();
		}//while
		
		System.out.println("Los numeros entre " + a + " y " +b + " son: ");
		for (int k = a; k  <=b ; k++ ){
			System.out.println(k);
		}
		
	}

}
