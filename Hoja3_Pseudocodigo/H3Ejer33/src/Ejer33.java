import java.util.Scanner;
public class Ejer33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String[] vectorNombre;
		vectorNombre = new String[5];
		
		for (int k=0; k < 5 ; k++){
			System.out.println("Introduce un nombre");
			vectorNombre[k]=teclado.nextLine();
		}
		System.out.println("Los nombres introducidos son:");
		System.out.println();
		
		for (int k =0; k<5;k++ ){
			System.out.println(vectorNombre[k]);
		}
	}

}
