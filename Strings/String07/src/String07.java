import java.util.Scanner;
public class String07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la frase: ");
		String frase = new String();
		frase=teclado.nextLine();// recogemos la frase 
		int contaMayus = 0;
		int contaMinus = 0;
		int contaNum = 0;
		
		for (int contador = 0; contador < frase.length(); contador++ ) {
			if (frase.codePointAt(contador) >= 65 && frase.codePointAt(contador)<=90){
				contaMayus++;
			}//if
			if (frase.codePointAt(contador) >= 97 && frase.codePointAt(contador)<=122){
				contaMinus++;
			}//if
			
			if (frase.charAt(contador) > 47 && frase.charAt(contador) < 58){
				contaNum++;
			}//if
		}//for
		
		System.out.println("Mayusculas: " + contaMayus);
		System.out.println("Minusculas: " + contaMinus);
		System.out.println("Numeros: " + contaNum);
	}

}
