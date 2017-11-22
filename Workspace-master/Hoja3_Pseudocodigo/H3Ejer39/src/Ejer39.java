import java.util.Scanner;
public class Ejer39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int curso=0;
		int alum=0;
		int aux=1;
		boolean ordenado = false;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte el numero de cursos");
		curso=teclado.nextInt();
		System.out.println("Inserte el numero de alumnos");
		alum=teclado.nextInt();
		
		int vectorNotas[][];
		vectorNotas = new int[curso][alum];
		
		int vectorNotasOrde[][];
		vectorNotasOrde = new int[curso][alum];
		
		
		for (int f=0; f < curso ; f++){
			for (int c = 0; c < alum ;c++){
				vectorNotas[f][c]=(int) (Math.random()*11);
				System.out.printf("%5d" ,vectorNotas[f][c]);
			}
			System.out.println();
		}
		
	
		
	}

}
