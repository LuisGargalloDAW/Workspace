import java.util.Scanner;
public class Ejer35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	int[] notas;
	notas = new int[10];
	int suma = 0;
	float media = (float) 0.0;
	int opcion=1,nota,posicion = 0;
	
	
	
	System.out.println("Tus notas son:");
	for (int k = 0; k < 10; k++ ){
		notas[k]=(int) (Math.random()*11);
		System.out.println( notas[k]);
		suma= suma + notas[k];
	}
	
	
	media= (float)suma/10;
	System.out.println();
	System.out.println("La media de tus notas es:  "+ media);
	
	while (opcion!=0) {
	System.out.println();
	System.out.println("�Quieres buscar una nota?");
	System.out.println("1-Si");
	System.out.println("0-cerrar");
	
	opcion=teclado.nextInt();
	
	while(opcion>1||opcion<0){
		System.out.println("El parametro introducido no es valido");
		System.out.println("Introduce una opcion valida");
		opcion=teclado.nextInt();
	}
	
		if (opcion == 1){
			System.out.println("�Que nota quieres buscar?");
			System.out.println("Introduce un numero del 0 al 10");
			nota=teclado.nextInt();
			while(nota>11||nota<0){
				System.out.println("El parametro introducido no es valido");
				System.out.println("Introduce una opcion valida");
				opcion=teclado.nextInt();
			}
			
			for (int k = 0; k < 10; k++ ){
				if (notas[k]==nota){
					posicion = k;
				}
			}	
			
			if (posicion!=0){
				System.out.println("Tu nota: " + nota + " esta en la posicion " + posicion+ " de tus calificaciones");
	
			}else{
				System.out.println("Esa nota no pertenece a tus calificaciones");
	
			}
		
	}
		
		
	}
	
	}
}
