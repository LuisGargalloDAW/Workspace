import java.util.Scanner;
public class S01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		String frase = "";
		String strLetra="", strLetraMayus="";

		char vectorFrase[];
		System.out.println("Introduzca una frase");
		frase=teclado.nextLine();
		vectorFrase = new char[frase.length()];

		do{
			System.out.println("Introduzca una letra");
			strLetra=teclado.nextLine();
		}while(strLetra.length()!=1);

		for(int k = 0; k < frase.length() ; k++){
			vectorFrase[k]=frase.charAt(k);
		}

		for(int k = 0; k < frase.length() ; k++){
			if (frase.charAt(k)==strLetra.charAt(0)){
				strLetraMayus = strLetra.toUpperCase();
				vectorFrase[k]=strLetraMayus.charAt(0);
				//letra.toUpperCase()
			}
			System.out.print(vectorFrase[k]);
		}




	}

}
