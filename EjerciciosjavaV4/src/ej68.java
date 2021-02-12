import java.util.*;
public class ej68 {
	public static void main(String[] args) {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena de carácteres");
		nombre = sc.nextLine();
		System.out.println("Introducimos la cadena en el vector: ");
		for (int i=0;i<nombre.length();i++) {
			char ch = nombre.charAt(i);
			if (ch == ' ') {
				ch = '@';
			}
			System.out.print(ch+", ");
		}
	}
	}

