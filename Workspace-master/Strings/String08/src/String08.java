import java.util.Scanner;
public class String08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String frase = new String();
		String fraseCodificada =  new String();
		
		int palabra=0;
		do{
			System.out.println("Ingrese la frase: ");
			frase=teclado.nextLine();// recogemos la frase 
		} while(!frase.equals(frase.toUpperCase())); {
			System.out.println("Ingrese un numero: ");
			int numero;
			numero=teclado.nextInt();
			
			
		for (int k=0;k< frase.length(); k++){
			palabra=frase.charAt(k)+numero;
			fraseCodificada= fraseCodificada + (char)palabra;
			//palabra=0;
		}
		System.out.println(fraseCodificada);
		
		}
		
		
		
		/*while(frase.equals(frase.toLowerCase())){
			System.out.println("Ingrese la frase en mayusculas: ");
			frase=teclado.nextLine();// recogemos la frase 
		}//filtrado de mayusculas
		
		System.out.println("Ingrese un numero: ");
		int numero;
		numero=teclado.nextInt();*/
		
	}

} 
