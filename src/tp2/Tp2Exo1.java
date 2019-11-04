package tp2;
import java.util.Scanner;
public class Tp2Exo1 {

public static void main(String[]args){
		
		Scanner lecture_clavier =new Scanner(System.in);
		int valeur1;
		int valeur2;
		
		System.out.println("Saisir un entier : ");
		valeur1 =lecture_clavier.nextInt();
		//System.out.print("Entier saisi = "+valeur);
		System.out.println("Saisir une autre entier : ");
		valeur2 =lecture_clavier.nextInt();
		System.out.print("La somme des deux valeurs est  = "+(valeur1+valeur2));
		System.out.print("Le produit des deux valeurs est  = "+valeur1*valeur2);
		lecture_clavier.close();
		}

}
