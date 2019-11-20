package tp4;
import java.util.Scanner;
public class Tp4Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int code=1234;

		System.out.println("Entrez le code ");

		int codeUser=scanner.nextInt();

		int i = 1;

		while (code!=codeUser &&i!=5) {

			System.out.println("mauvais code recomencez");

			codeUser=scanner.nextInt();

			i++;

		}

		System.out.println(i);

		if (codeUser!=code) {

			System.out.println("Trop d'essai, compte bloqué");

		} else {

			System.out.println("Bravo");

		}

		scanner.close();



	}



}