package tp2;
import java.util.Scanner;
public class Tp2Exo1 {

public static void main(String[]args){
		
		Scanner lecture_clavier =new Scanner(System.in);
		int valeur;
		System.out.print("Saisir un entier : ");
		valeur =lecture_clavier.nextInt();System.out.print("Entier saisi = "+valeur);
		lecture_clavier.close();
		}

}
