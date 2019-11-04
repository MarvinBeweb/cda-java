package tp2;
import javax.swing.JOptionPane;
public class Tp2Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texte = JOptionPane.showInputDialog(null, "taper une valeur");
		String texte2 = JOptionPane.showInputDialog(null, "taper une autre valeur");
		int valeur1 = Integer.parseInt(texte);
		int valeur2 = Integer.parseInt(texte2);
		int somme = valeur1+valeur2;
		int produit = valeur1 * valeur2;
		JOptionPane.showMessageDialog(null,somme);
		JOptionPane.showMessageDialog(null,produit);
	}
	}


