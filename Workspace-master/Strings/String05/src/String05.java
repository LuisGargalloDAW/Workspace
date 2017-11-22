import java.util.Scanner;
public class String05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la frase: ");
		String frase = new String();
		frase=teclado.nextLine();// recogemos la frase 
		String par = new String();
		String impar = new String();
		while (frase.length()>80){
			System.out.println("Ingrese la frase con menos de 80 caracteres: ");
			frase=teclado.nextLine();// recogemos la frase
		}
		for(int cont=0;cont<frase.length();cont++){
			if (cont%2==0){
				par= par + frase.charAt(cont);
			}else{
				impar=impar+frase.charAt(cont);
			}
		}//for
		System.out.println("Estas son las letras de la frase en posicion par: " + par);
		System.out.println("Estas son las letras de la frase en posicion impar: " + impar);
	}
}
