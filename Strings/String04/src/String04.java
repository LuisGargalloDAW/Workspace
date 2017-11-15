import java.util.Scanner;
public class String04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la frase: ");
		String frase = new String();
		frase=teclado.nextLine();// recogemos la frase 
		
		while (frase.length()>80){
			System.out.println("Ingrese la frase con menos de 80 caracteres: ");
			frase=teclado.nextLine();// recogemos la frase
		}
		
		int opcion =0;
		System.out.println("1 - Imprime la frase en minusculas");
		System.out.println("2 - Imorime la frase en MAYUSCULAS");
		opcion=teclado.nextInt();
		
		if (opcion == 1){
			System.out.println(frase.toLowerCase());
		}else if (opcion == 2){
			System.out.println(frase.toUpperCase());
		}else {
			System.out.println("el parametro introducido no es correcto");
		}
	}

}
