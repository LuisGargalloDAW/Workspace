import java.util.Scanner;

/* Escribe un programa que pida por teclado una cadena y una letra, de manera que
elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
por pantalla. Programa realizado por Luis Gargallo alarcos */
public class S02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		String frase="",letra="", cadena=" ";
		int contador=0;
		char vectorFrase[];

		System.out.println("Introduzca una frase");
		frase=teclado.nextLine();
		vectorFrase = new char[frase.length()];

		do{
			System.out.println("Introduzca una letra");
			letra=teclado.nextLine();
		}while(letra.length()!=1);

		for(int k = 0; k < frase.length() ; k++){
			vectorFrase[k]=frase.charAt(k);
		}//bucle para pasar la frase a un array de letras

		for(int k = 0; k < frase.length() ; k++){
			if (frase.charAt(k)==letra.charAt(0)){
				vectorFrase[k]=cadena.charAt(0);
			}
			System.out.print(vectorFrase[k]);
		}


	}

}
