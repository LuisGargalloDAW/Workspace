
public class Ejer36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int filas=4;
		final int columnas=5;
		int vector[][];
		vector = new int[filas][columnas];
		
		for (int f=0; f < filas; f++){
			for (int c = 0; c < columnas ;c++){
				vector[f][c]=(int) (Math.random()*101);
				System.out.printf("%5d" ,vector[f][c]);
			}
			System.out.println();
		}
		
	}

}
