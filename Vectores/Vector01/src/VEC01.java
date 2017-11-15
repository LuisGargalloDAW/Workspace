import java.util.Scanner;
public class VEC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		final int MAX_NUM = 20;
		int[] vectorNum;
		vectorNum = new int[MAX_NUM];
		int suma=0;
		int contaSup=0;
		int contaMin=0;
		int contaMed=0;
		
		for(int k = 0; k < MAX_NUM; k++){
			vectorNum[k]= (int) (Math.random() * 21 -10);
			System.out.println(vectorNum[k]);
			suma = suma + vectorNum[k];
		}
		int media = suma/MAX_NUM;
		
		System.out.println("la media es: "+ media);
		for(int k = 0; k < MAX_NUM; k++){
			if (vectorNum[k]<media){
				contaMin++;	
			}else if (vectorNum[k]>media){ 
				contaSup++;
			}else {
				contaMed++;
			}
		}
		System.out.println("Numero de valores superiores a la media: "+ contaSup);
		System.out.println("Numero de valores inferiores a la media: "+ contaMin);
		System.out.println("Numero de valores iguales a la media : "+ media);
	}

}
