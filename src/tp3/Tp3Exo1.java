package tp3;

import java.util.Scanner;

public class Tp3Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lecture_clavier =new Scanner(System.in);
		
		//bytes
		byte bytes;
		short shorts ;
		int ints;
		long longs ; 
		float floats;
		double doubles;
		boolean boolaens;
		char texte;
		System.out.println("Saisir un byte entre -128 et 127 : ");
		bytes =lecture_clavier.nextByte();
		System.out.print("bytes = "+bytes );
		
		//short
		System.out.println("Saisir un short entre -32768 et 32767 : ");
		shorts =lecture_clavier.nextShort();
		System.out.print("short = "+ shorts);
		
		//int
		System.out.println("Saisir un int entre -2147483 648 et 2147483 648 : ");
		ints =lecture_clavier.nextInt();
		System.out.print("short = "+ ints);
		
		//long
		System.out.println("Saisir un long entre -9223372036854775 808 et 9223372036854775 808 : ");
		longs =lecture_clavier.nextLong();
		System.out.print("long = "+ longs);
		//float
		System.out.println("Saisir un long entre +/-1.4e-45 et +/-3.4e38 : ");
		floats =lecture_clavier.nextFloat();
		System.out.print("long = "+ floats);
		//double
		System.out.println("Saisir un long entre +/. 4.940e-324 et +/-1.797e308 : ");
		doubles =lecture_clavier.nextDouble();
		System.out.print("double = "+ doubles);
		//boolean
		System.out.println("Saisir une valeur logique : true ou false: ");
		boolaens =lecture_clavier.nextBoolean();
		System.out.print("boolean = "+ boolaens);
		//Varchar
		System.out.println("Saisir une chaine de caractère");
		texte =lecture_clavier.next().charAt(0);
		System.out.print("Char = "+ texte);
		
		
		lecture_clavier.close();
		
	}

}
