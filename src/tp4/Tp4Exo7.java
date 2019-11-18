package tp4;
import java.util.Scanner;

public class Tp4Exo7 {

	public static void main(String[] args) {

		Scanner lecture = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre entier ");
		int nombre = lecture.nextInt();
		System.out.println("Donnez un numero de Bits compris entre 0 et 31");
		int bit = lecture.nextInt();
		if (bit < 0 || bit >31) {
			System.out.println("saisie incorrecte");
			
		}
		else {

            int calcul = (nombre & 1 << bit) !=0 ? 1 : 0;

            System.out.println(calcul);

        }
		lecture.close();
		
		
	}

}
