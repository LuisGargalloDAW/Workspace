import java.util.Scanner;
public class S03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		String frase=""; 
		String fraseReves="";
		char vectorLetras[];

		System.out.println("Introduzca una frase");
		frase=teclado.nextLine();
		int contador= -1 + frase.length();
		vectorLetras = new char[frase.length()];



		for(int k = 0; k < frase.length() ; k++){
			vectorLetras[k]=frase.charAt(contador);
			contador--;
		}

		for(int k = 0; k < frase.length() ; k++){
			fraseReves=fraseReves + vectorLetras[k];
		}

		System.out.println(fraseReves);

		if(frase.equals(fraseReves)){
			System.out.println("la palabra si es un palindromo");
		} else {
			System.out.println("La palabra no es un palindromo");
		}
	}

}
