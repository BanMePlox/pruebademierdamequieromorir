import java.util.*;
public class ej69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		Random r = new Random();
		char [] abecedario = new char[26];
		
		for(char ch= 'A'; ch <= 'Z'; ch++) {
			abecedario[ch-'A']=ch;
		}
	numero=	(int)(r.nextDouble()*26+1);
		System.out.print(abecedario[numero]);
		//System.out.print(numero);

	}

}
