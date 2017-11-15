
public class VEC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vector1,vector2;
		int[] vectorOrdenado;
		int[] vectorSuma;
		int[] vectorAux;
		vector1= new int [10];
		vector2= new int [10];
		vectorSuma= new int [10];
		vectorOrdenado= new int [10];
		vectorAux= new int [10];
		int indice, iteracion;
		
		
		for (int k = 0; k < 10; k++ ){
			vector1[k]=(int) (Math.random() * 11);
			vector2[k]=(int) (Math.random() * 11);
			vectorSuma[k]=vector1[k]+vector2[k];
			
		}
		
		for (int k =0; k < 10; k++){
			vectorAux[k]=vectorSuma[k];
		}
		for( iteracion = 0; iteracion < 9; iteracion++)
			for(indice = 0; indice < 10-iteracion-1; indice++)
				if( vectorSuma[ indice + 1 ] < vectorSuma[ indice ]){
					vectorOrdenado[indice] =  vectorSuma[ indice + 1 ];
					vectorSuma[ indice + 1 ] = vectorSuma[ indice ];
					vectorSuma[ indice ] = vectorOrdenado[indice];
				}
		
		for (int k =0; k < 10; k++){
			System.out.printf("\n%3d%6d%6d%6d", vector1[k],vector2[k],vectorAux[k] ,vectorSuma[k]);
		}
		
		
	}

}
