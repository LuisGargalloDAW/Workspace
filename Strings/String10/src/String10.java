import java.util.Scanner;
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase = new String();

		final int letras = 26;
		int[] vectorContador ;
		vectorContador = new int[letras];
		int contaLetras =0;
		for (int k= 0; k<letras;k++){
			vectorContador[k]=0;
		}
		
		do{
			System.out.println("Ingrese la frase: ");
			frase=teclado.nextLine();// recogemos la frase 
		} while(!frase.equals(frase.toUpperCase())); 

		for (int con= 0 ; con < frase.length(); con++){
			if (frase.charAt(con)>=65 && frase.charAt(con)<=90){
				vectorContador[frase.charAt(con)-65]++;
			}//if
		}//for

		for (int l= 0; l<letras;l++ ){
			if (vectorContador[l]!=0){
				//System.out.println("la letra " + frase.charAt(l) + " aparece "+ vectorContador[l]+ " veces ");//Este fue el primer intento 
				System.out.println("la letra " + (char)(l+65) + " aparece "+ vectorContador[l]+ " veces ");
				contaLetras++;
				
			}
		}
		
		System.out.println("Aparecen " + contaLetras + " distintas");



	}
}
