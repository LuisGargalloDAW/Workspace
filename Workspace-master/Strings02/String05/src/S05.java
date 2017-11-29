import java.util.Scanner;
public class S05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		String palabra="";
		char vectorLetras[];
		char aux;
		
		System.out.println("Introduzca una palabra");
		palabra=teclado.nextLine();
		vectorLetras = new char [palabra.length()];
		
		for (int k = 0; k < palabra.length(); k++){
			vectorLetras[k]=palabra.charAt(k);
		}
		
		aux=vectorLetras[0];
		vectorLetras[0]=vectorLetras[palabra.length()-1];
		vectorLetras[palabra.length()-1]=aux;
		
		for (int k = 0; k < palabra.length(); k++){
			System.out.print(vectorLetras[k]);
		}
		
	}

}
