import java.util.Scanner;
public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String frase;
		frase = new String();
		int opcion =1;
		int contador=1;
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		
		while (opcion!=0){
			System.out.println("¿Quieres introducir otra?");
			System.out.println("1-si");
			System.out.println("0-no");
			opcion=teclado.nextInt();
			if ( opcion == 1 ){
				System.out.println("Introduce otra frase");
				teclado.nextLine();
				frase=teclado.nextLine();
				contador++;
				
			}else if (opcion>0 && opcion<1){
				System.out.println("Has introducido un parametro no valido");
			}
		
		}
	}

}
