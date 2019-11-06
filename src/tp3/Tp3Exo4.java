package tp3;
import java.util.Scanner;
public class Tp3Exo4 {

	public static void main(String[] args) {
		
			  Scanner input = new Scanner(System.in);
		      System.out.println("Entre une valeur en seconde: ");
		      int n = input.nextInt();
		      //
		      int heure = (n%86400)/3600;
		      int min = ((n%86400)%3600) /60;
		      int sec =(((n%86400)%3600)%60);
		      System.out.print("le resultat est  "+heure+"  heure, "+min+"  minute, and "+sec+" seconde. ");
		      input.close();
		}
	}