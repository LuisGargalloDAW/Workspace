import java.util.Scanner;
public class S04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		String nombre1="";
		String nombre2="";
		String ape1="";
		String ape2="";
		String nom1="";
		String nom2="";
		int posicion=0;
		int contador=0;
		
		System.out.println("Introduzca un nombre y un apellido");
		nombre1=teclado.nextLine();
		System.out.println("Introduzca otro nombre y un apellido");
		nombre2=teclado.nextLine();
		
		for (int k =0; k < nombre1.length() ; k++){
			if (nombre1.valueOf(nombre1.charAt(k)).equals(" ")&& contador==0){
				posicion = k;
				contador++;
			}
		}
		
		ape1=nombre1.substring(posicion, nombre1.length());
		nom1=nombre1.substring(0, posicion);
		contador=0;
		
		
		for (int k =0; k < nombre1.length() ; k++){
			if (nombre2.valueOf(nombre2.charAt(k)).equals(" ")&& contador==0){
				posicion = k;
				contador++;
			}
		}
		
		ape2=nombre2.substring(posicion, nombre2.length());
		nom2=nombre2.substring(0, posicion);
		
		System.out.println();
		System.out.println("El resultado del programa es: ");
		System.out.println(nom1 + " " + ape2);
		System.out.println(nom2 + " " + ape1);
	}

}
