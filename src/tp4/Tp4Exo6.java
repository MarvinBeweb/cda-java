                                   package tp4;

import java.util.Scanner;

public class Tp4Exo6 {

	public static void main(String[] args) {
        int impaire = 1;
        int sommeImpaire = 0;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donnez une valeur comprise entre 1 et 100 inclus");
		int nb = clavier.nextInt();
		
		
		while (nb < 1 || nb > 100) {
			System.out.println(
					"Non!. Donnez une valeur comprise entre 1 et 100 inclus SVP");	
					nb = clavier.nextInt();
		}
		for (int i = 0; i < nb; i++) {
			System.out.println(impaire);
			sommeImpaire += impaire;
			impaire += 2;
		}
		System.out.println(sommeImpaire);

        clavier.close();
        
	
	}
}

	

