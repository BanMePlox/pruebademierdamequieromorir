import java.util.*;
public class ej65 {
	public static void main(String[] args) {
		boolean ok=false;
		int upper=0;
		int lower=0;
		int numeros=0;
		boolean arrobas= false;
		int intentos=0;
		String pass;
		Scanner sc = new Scanner (System.in);
		//Hablamos de los requisitos al usuario que introduzca su contraseña.
		System.out.println("El password ha de tener las siguientes restricciones");
		System.out.println("1-Al menos 8 caracteres");
		System.out.println("2-Al menos la mitad ha de estar en minúscula");
		System.out.println("3-Al menos 2 mayusculas");
		System.out.println("4- Al menos 3 números");
		System.out.println("5- No incluir el caracter '@'");
		//Abrimos un bucle while que se extenderá siempre que "ok" sea falso, tal y como está declarado en la linea 4
		while (ok==false) {
			//Declaramos aquí las variables que comprobarán cada una de las condiciones, dado que así se reiniciarán en caso de un error en la introducción de la contraseña.
			intentos++;
			boolean uno = true;
			boolean dos= true;
			boolean tres = true;
			boolean cuatro = true;
			boolean cinco = true;
			System.out.println("Introduzca su contraseña");
			pass = sc.nextLine();
			//CONTAMOS MAYUSCULAS, MINUSCULAS, NÚMEROS Y COMPROBAMOS SI HAY ALGUNA @. Con la primera parte, comprobará cuantas mayúsculas hay. Luego, cuantas minúsculas, cuantos números y comprobará si hay arrobas.
			for(int i=0; i<pass.length(); i++){
				char ch=pass.charAt(i);
				if(ch>='A' && ch<='Z'){
				    upper++;
				}
				else if(ch>='a' && ch<='z'){
				    lower++;
				}
				if (ch>='0' && ch<='9') {
					numeros++;
				}
				if (ch=='@') {
					arrobas=true;
				}}
			//Comenzamos a comprobar los requisitos de la contraseña. Si algún requisito está incumplido, cambiamos el booleano asignado a ese valor para dar el error al final.
				//Requisito 1: Comprobamos que el tamaño de la contraseña es mayor que 8.
			if (pass.length()<8) {
				System.out.println("El tamaño del password ha de ser, como mínimo, de 8 caracteres. El tuyo es de "+ pass.length());
				uno = false;
			}
				//Requisito 2: Comprobamos si la mitad o más está en minúscula comparando el número de mayúsculas y de minúsculas.
			if (upper>lower) {
				System.out.println("Por lo menos la mitad del password debería estar en minusculas.");
				dos = false;
			}
			//Requisito 3: Comprobamos si hay, como mínimo, 2 mayúsculas en la contraseña, pidiendo que la variable upper sea superior a 2.
			if (upper<2) {
				System.out.println("Deben existir, al menos, 2 mayusculas, y solo tienes "+upper);
				tres = false;
			}
			//Requisito 4: Comprobamos si hay, como mínimo, tres números a lo largo de toda la contraseña, y, como en los demás, en caso negativo, cambiamos "cuatro" a un valor falso.
			if (numeros<3) {
				System.out.println("La contraseña debería contener, por lo menos, tres numeros, y contiene "+ numeros+ " numeros");
				cuatro = false;
			}
			//Requisito 5: Comprobamos si a lo largo de la contraseña podemos encontrar alguna arroba, y, en caso afirmativo, modificamos la variable "cinco" a "false". 
			if (arrobas==true) {
				System.out.println("La contraseña no puede contener @, y lo hace");
				cinco = false;
			}
			//Si todo está correcto, llegamos al final, donde felicitamos al usuario y cambiamos "ok" a true para salir del bucle while. En caso de que no todo esté correcto, no entramos a este bucle.
			//En caso de no poder entrar a este bucle porque hay algún error, el usuario verá los mensajes impresos de sus errores y volverá a ejecutarse el bucle, pidiendo una nueva contraseña.
			if (uno && dos && tres && cuatro && cinco ) {
				System.out.println("El password cumple todas las restricciones. Enhorabuena!");
				if (intentos==1) {
					System.out.println("Solo has tardado "+ intentos + " intento! Para que luego digan que no eres talentoso, has logrado entender los requisitos a la primera!");
				}
				else if (intentos==2) {
					System.out.println("Solo has tardado "+ intentos + " intentos! Un pequeño error lo tiene cualquiera, no?");
				}
				else if (intentos==3) {
					System.out.println("Solo has tardado "+ intentos + "intentos! Bueno, te has despistado, es comprensible... Por lo menos no has tardado 4 veces!");
				}
				else if (intentos>=4) {
					System.out.println("Pero vamos a ver puto degenerado mental de mierda a que no era tan difícil leer 5 REQUISITOS. HAS TARDADO "+ intentos + " INTENTOS EN ENTENDER 5 REQUISITOS DE MIERDA. FIJO QUE VOTAS A VOX.");
					System.out.println("Ahora entiendo que tus padres te abandonaran, cojones.");
				}
				ok = true;
			}
			
			
				
	}

}}
