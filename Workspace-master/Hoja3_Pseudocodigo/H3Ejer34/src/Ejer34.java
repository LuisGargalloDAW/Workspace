import java.util.Scanner;
public class Ejer34 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	int[] notas;
	notas = new int[10];
	int suma = 0;
	float media = (float) 0.0;
	
	
	
	System.out.println("Tus notas son:");
	for (int k = 0; k < 10; k++ ){
		notas[k]=(int) (Math.random()*11);
		System.out.println( notas[k]);
		suma= suma + notas[k];
	}
	media= (float)suma/10;
	System.out.println();
	System.out.println("La media de tus notas es:  "+ media);
	
	}
}
