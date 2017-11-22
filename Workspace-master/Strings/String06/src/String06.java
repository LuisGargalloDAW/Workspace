import java.util.Scanner;
public class String06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		String frase;
		int posicion=0;
		int numericos=0, vocales=0, consonantes=0;
		
		
		
		System.out.println("Introduce una frase con menos de 80 caracteres:");
		frase=teclado.nextLine();
		
		while (frase.length()>80){
			System.out.println("Ingrese la frase con menos de 80 caracteres: ");
			frase=teclado.nextLine();// recogemos la frase
		}
		frase= frase.toLowerCase();
		int longitud = frase.length();
		
		while (posicion<longitud){
			int lugar = frase.charAt(posicion);//Indicamos la letra de la frase mediante un charat
			if (lugar>47 && lugar<58){
				numericos++;
			}else{
				if (lugar==97 || lugar==101 || lugar==105 || lugar==111 || lugar==117){
					vocales++;
				}else{
					if(lugar>96 && lugar<123)
					consonantes++;
				}
			}
			posicion++;
		}
		System.out.println("Numeros: " + numericos);
		System.out.println("Vocales: " + vocales);
		System.out.println("Consonantes: " + consonantes);
		
	}
	
}