
public class VEC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int f = 5;
		final int c = 5;
		int max=-100;
		int min=100;
		int posicionmax=0;
		int posicionmin=0;
		
		
		int[][] vector;
		vector = new int[f][c];
		
		for(int k = 0; k < f ; k++){
			for (int l = 0; l < c; l++){
				vector[k][l]=(int) (Math.random() * (100-(-100)+1)-100);
				System.out.printf("%5d",vector[k][l]);
			}
			System.out.println();
		}//for 
		
		/*Este bucle encuentra cual es el numero mayor y cual es el 
		 * mas peque�o
		y su posicion*/
		for(int k = 0; k < f ; k++){
			for (int l = 0; l < c; l++){
				if (max <= vector[k][l] ){
					max = vector[k][l];
					posicionmax= 5 * k + l +1 ;
					
				}
				if (min >= vector[k][l] ){
					min = vector[k][l];
					posicionmin= 5 * k + l +1 ;
				}
				}
			}
	
		System.out.println("\nEl numero mas grande es: "+ max +" en la posicion "+ posicionmax );
		System.out.println("El numero mas peque�o es : " + min + " en la posicion " +posicionmin);
		}

		
	}


