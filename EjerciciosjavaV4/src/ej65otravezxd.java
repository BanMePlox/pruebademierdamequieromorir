import java.util.Scanner;

public class ej65otravezxd {

	public static void main(String[] args) {
		String pass;
		Scanner sc = new Scanner(System.in);
		boolean ok=false;
		boolean uno = true;
		boolean dos = true;
		boolean tres = true;
		boolean cuatro = true;
		boolean cinco = true;
		int upper=0;
		int lower=0;
		int numeros=0;
		int arrobas=0;
		System.out.println("Requisitos de la contraseña:");
		System.out.println("1- Ha de tener, al menos, 8 caracteres.");
		System.out.println("2- Al menos la mitad del password ha de estar en minúsculas.");
		System.out.println("3- El password ha de tener, al menos, 2 mayúsculas.");
		System.out.println("4- El password ha de tener, al menos, 3 números.");
		System.out.println("5- El password NO ha de incluir el carácter ‘@’.");
		while (ok==false) {
			System.out.println("Introduzca una contraseña");
			pass = sc.nextLine();
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
					arrobas++;
				}}
			if (pass.length()<8) {
				System.out.println("No tiene 8 caracteres. Solo tienes "+ pass.length());
				uno = false;
			}
			if (upper>lower) {
				System.out.println("Al menos la mitad tiene que estar en minúsculas, y no cumples este requisito");
				dos = false;
			}
			if (upper<2) {
				System.out.println("No tiene el mínimo de 2 mayúsculas. Tu tienes " + upper);
				tres = false;
			}
			if (numeros<3) {
				System.out.println("No contiene el mínimo de 3 números. Solamente contiene "+ numeros);
				cuatro = false;
			}
			if (arrobas>0) {
				System.out.println("La contraseña inclue '@', y no debe hacerlo. Contiene "+ arrobas + " arrobas");
				cinco = false;
			}
			if (uno && dos && tres && cuatro && cinco) {
				ok = true;
				}
			if (uno != true|| dos != true || tres != true || cuatro != true || cinco != true) {
				uno = false;
				dos = false;
				tres = false;
				cuatro = false;
				cinco = false;
			}
			}
		System.out.println("Contraseña correcta!");
		}
	}

