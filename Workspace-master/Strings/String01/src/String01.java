import java.util.Scanner;
public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la frase: ");
		String frase = new String();
		frase=teclado.nextLine();// recogemos la frase 
		int longitud = frase.length();//Necesitamos saber la longitud de la frase para obtener los indices
		int contador = 0; //Inicializamos el contador a cero porque el primer caracter de la cadena tiene valor cero.
		String fin = new String("");/* Puedo utilizar una cadena vacia como almacen para guardar los resultado del bucle.*/
		
		while (contador < longitud){
			char palabra=frase.charAt(contador);//El valor contador es el que nos indica el indice para saber que letra deseamos imprimir
			contador++;
			fin = fin + palabra;
			System.out.println(fin);
		}
		
		
		
		
		
		
		
	}

}
