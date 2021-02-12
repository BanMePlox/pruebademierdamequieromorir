import java.util.*;
public class tresenralla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		boolean fin = true;
		int random1 =0;
		int random2 =0;
		int uno=0;
		int dos=0;
		String[][] matriz = new String[3][3];
		matriz[0][0] = "-";
		matriz[0][1] = "-";
		matriz[0][2] = "-";
		matriz[1][0] = "-";
		matriz[1][1] = "-";
		matriz[1][2] = "-";
		matriz[2][0] = "-";
		matriz[2][1] = "-";
		matriz[2][2] = "-";
		while (fin) {
			System.out.println("Inserta posición X");
			uno = sc.nextInt();
						while (uno>2 || uno<0) {
				System.out.println("La columna está fuera de la tabla! Valores posibles: 0, 1, 2");
				uno = sc.nextInt();
			}
			System.out.println("Inserta posición Y");
			dos = sc.nextInt();
					while (dos>2 | dos<0) {
				System.out.println("La columna está fuera de la tabla! Valores posibles: 0, 1, 2");
				dos = sc.nextInt();
			} 
			matriz[uno][dos] = "X";
			System.out.print(matriz[0][0]+" ");
			System.out.print(matriz[0][1]+" ");
			System.out.print(matriz[0][2]+" ");
			System.out.printf("\n");
			System.out.print(matriz[1][0]+" ");
			System.out.print(matriz[1][1]+" ");
			System.out.print(matriz[1][2]+" ");
			System.out.printf("\n");

			System.out.print(matriz[2][0]+" ");
			System.out.print(matriz[2][1]+" ");
			System.out.print(matriz[2][2]+" ");
			System.out.printf("\n\n");
			System.out.println("Ahora tira la máquina\n");
			
			random1 = (int)(rnd.nextDouble()*2);
			random2 = (int)(rnd.nextDouble()*2);
			while (matriz[random1][random2] == "X") {
				random1 = (int)(rnd.nextDouble()*3);
				random2 = (int)(rnd.nextDouble()*3);
			
				}
			while (matriz[random1][random2] == "O") {
				random1 = (int)(rnd.nextDouble()*3);
				random2 = (int)(rnd.nextDouble()*3);
			
				}
			matriz[random1][random2] = "O";

				System.out.print(matriz[0][0]+" ");
				System.out.print(matriz[0][1]+" ");
				System.out.print(matriz[0][2]+" ");
				System.out.printf("\n");
				System.out.print(matriz[1][0]+" ");
				System.out.print(matriz[1][1]+" ");
				System.out.print(matriz[1][2]+" ");
				System.out.printf("\n");

				System.out.print(matriz[2][0]+" ");
				System.out.print(matriz[2][1]+" ");
				System.out.print(matriz[2][2]+" ");
				System.out.printf("\n");
				if (matriz[0][0].equals("X")) {
					if (matriz[0][1].equals("X")) {
						if (matriz[0][2].equals("X")) {
							fin=false;
						}
						
				}
					if (matriz[1][0].equals("X")) {
						if (matriz[2][0].equals("X")) {
							fin=false;
						}
					}
					if (matriz[1][1].equals("X")) {
						if (matriz[2][2].equals("X")) {
							fin=false;
						}
					}
				}
				if (matriz[2][0].equals("X")) {
					if (matriz[2][1].equals("X")) {
						if (matriz[2][2].equals("X")) {
							fin=false;
						}
					}
					if (matriz[1][1].equals("X")) {
						if (matriz[0][2].equals("X")) {
							fin=false;
						}
					}
				}
				if (matriz[1][0].equals("X")) {
					if (matriz[1][1].equals("X")) {
						if (matriz[1][2].equals("X")) {
							fin=false;
						}
					}
				}
				if (matriz[0][1].equals("X")) {
					if (matriz[1][1].equals("X")) {
						if (matriz[2][1].equals("X")) {
							fin=false;
						}
					}
				}
				if (matriz[0][2].equals("X")) {
					if (matriz[1][2].equals("X")) {
						if (matriz[2][2].equals("X")) {
							fin=false;
						}
					}
				}
				if (matriz[0][0].equals("O")) {
					if (matriz[0][1].equals("O")) {
						if (matriz[0][2].equals("O")) {
							fin=false;
						}
						
				}
					if (matriz[1][0].equals("O")) {
						if (matriz[2][0].equals("O")) {
							fin=false;
						}
					}
					if (matriz[1][1].equals("O")) {
						if (matriz[2][2].equals("O")) {
							fin=false;
						}
					}
				}
				if (matriz[2][0].equals("O")) {
					if (matriz[2][1].equals("O")) {
						if (matriz[2][2].equals("O")) {
							fin=false;
						}
					}
					if (matriz[1][1].equals("O")) {
						if (matriz[0][2].equals("O")) {
							fin=false;
						}
					}
				}
				if (matriz[1][0].equals("O")) {
					if (matriz[1][1].equals("O")) {
						if (matriz[1][2].equals("O")) {
							fin=false;
						}
					}
				}
				if (matriz[0][1].equals("O")) {
					if (matriz[1][1].equals("O")) {
						if (matriz[2][1].equals("O")) {
							fin=false;
						}
					}
				}
				if (matriz[0][2].equals("O")) {
					if (matriz[1][2].equals("O")) {
						if (matriz[2][2].equals("O")) {
							fin=false;
						}
					}
				}
				if (!fin) {
					System.out.println("Tenemos un ganador!");
					break;
				}
				}
			

		}
		

	

}
