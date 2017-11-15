
public class Ejer37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int filas=4;
		final int columnas=5;
		int vector[][];
		vector = new int[filas][columnas];
		int vector2[][] ;
		vector2 = new int[columnas][filas];
		
		System.out.println();
		System.out.println("Primera matriz: ");
		System.out.println();
		for (int f=0; f < filas; f++){
			for (int c = 0; c < columnas ;c++){
				vector[f][c]=(int) (Math.random()*101);
				System.out.printf("%5d" ,vector[f][c]);
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Segunda matriz:");
		System.out.println();
		
		
		for (int f=0; f < columnas; f++){
			for (int c = 0; c < filas ;c++){
				vector2[f][c]= vector[c][f];
				System.out.printf("%5d" ,vector2[f][c]);
			}
			System.out.println();
		}
		
	}

}
