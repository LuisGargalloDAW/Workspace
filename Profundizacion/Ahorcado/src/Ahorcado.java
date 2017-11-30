import java.util.Scanner;
public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String palabras[]={"casa","perro","luis","boli","vida"};
		String letrasJugadas="";
		//letrasJugadas = new String [50];
		String oculto[];
		int contaIntentos=0;
		String letra="", palabraAdivinar="", palabraOculta="";
		boolean correcto=false;
		
		palabraAdivinar = palabras[(int)(Math.random()*5)];
	
		oculto = new String [palabraAdivinar.length()];
		adivinar = new String [palabraAdivinar.length()];
		
		for (int k = 0; k < palabraAdivinar.length();k++  ){
			oculto[k]="X";
		}
		for (int k = 0; k < palabraAdivinar.length();k++  ){
			adivinar[k]=String.valueOf(palabraAdivinar.charAt(k));
		}
		
		
		while(correcto==false){
			
			System.out.println("Esta es la palabra que tienes que adivinar");
			for (int k = 0; k < palabraAdivinar.length();k++  ){
				System.out.print(oculto[k]);
			}// bucle para imprimir las incognitas
			do {
				System.out.println("Introduce una letra");
				letra=teclado.nextLine();
			}while (letra.length()!=1);
			
			letra=letra.toLowerCase();
			
			for (int k =0 ; k < palabraAdivinar.length(); k++){
				if (adivinar[k].equals(letra)){
					oculto[k]= String.valueOf(adivinar[k]);
				}else if  (adivinar[k].equals(letra)== false){
					letrasJugadas=letrasJugadas + letra;
				}
			}//cambia las x por la letra si es correcta
			
			for (int k =0 ; k < palabraAdivinar.length(); k++){
				palabraOculta=oculto[k];
			}
			
			
			System.out.println("Numero de intentos: " + contaIntentos);
			System.out.println();
			for (int k =0; k < contaIntentos; k++){
				System.out.print(letrasJugadas);
			}
			if (palabraOculta.equals(palabraAdivinar)){
				correcto=true;
			}
			
			
		
		}
		
		System.out.println("Enhorabuena has adivinado la palabra: era " + palabraAdivinar);
		
	}

}
