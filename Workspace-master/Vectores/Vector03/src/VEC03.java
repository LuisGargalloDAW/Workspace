
public class VEC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector;
		vector=new int[20];
		int min=10;
		int max=0;
		int posicion=0;
		int posicionmin=0;
		for(int k = 0; k<20;k++){
			vector[k]=(int) (Math.random() * 11);
			System.out.printf("%3d", vector[k]);
		}//for
		
		for(int k = 0; k<20;k++){
			if (vector[k]<=min){
				min = vector[k];
			}else if (vector[k]>=max){
				max = vector[k];
			}
		}//for 
		
		for(int k = 0; k<20;k++){
			if (max==vector[k]){
			posicion=k;
			}
			if (min==vector[k]){
				posicionmin=k;
				}
			
		}//for
		
		System.out.println("\n El numero mas grande es: " + max + " y esta en la posicion "+ posicion );
		System.out.println("El numero mas pequeño es: " + min + " y esta en la posicion "+ posicionmin );
	}

}
