import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		int base;
		int altura;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calcula el area de :");
		System.out.println("1 - Triangulo");
		System.out.println("2 - Cuadrado");
		System.out.println("3 - Rectangulo");
		System.out.println("0 - Salir");
		opcion = teclado.nextInt();
		
		while (opcion!=0){
			switch (opcion){
			case 0:
				break;
			case 1:
				System.out.println("Base del triangulo");
				base = teclado.nextInt();
				System.out.println("Altura del triangulo");
				altura = teclado.nextInt();
				double areatriangulo = (double)base * altura / 2;
				System.out.println("Base del triangulo es : " + areatriangulo );
				break;
			case 2:
				System.out.println("lado del cuadrado");
				base = teclado.nextInt();
				double areacuadradado = (double)base * base;
				System.out.println("Base del cuadrado es : " + areacuadradado );
				break;
			case 3:
				System.out.println("Base del rectangulo");
				base = teclado.nextInt();
				System.out.println("Altura del rectangulo");
				altura = teclado.nextInt();
				double arearectangulo = (double)base * altura;
				System.out.println("Base del triangulo es : " + arearectangulo );
				break;
			default:
				System.out.println("Ha introducido un parametro no valido");
			}
			System.out.println("Calcula el area de :");
			System.out.println("1 - Triangulo");
			System.out.println("2 - Cuadrado");
			System.out.println("3 - Rectangulo");
			System.out.println("0 - Salir");
			opcion = teclado.nextInt();
		}
		

	}

}
