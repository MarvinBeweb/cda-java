package tp4;
import java.util.Scanner;
public class Tp4Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lecture_clavier = new Scanner(System.in);

		int j, nombre;

		System.out.print("Entrez votre nombre : ");

		nombre = lecture_clavier.nextInt();

		System.out.println("Les nombres premiers jusqu'a " + nombre + " sont : ");

		for (j = 0; j <= nombre; j++) {

			if (nb_premier(j)) {

				System.out.println(j);

			}

		}

		lecture_clavier.close();
	}

	public static boolean nb_premier(int nombre) {

		int nb_diviseurs = 0;

		for (int i = 2; i <= nombre; i++) {

			if (nombre % i == 0) {

				nb_diviseurs += 1;

			}

		}

		return (nb_diviseurs == 1);



	}
}
