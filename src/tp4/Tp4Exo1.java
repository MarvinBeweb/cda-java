package tp4;

import javax.swing.JOptionPane;
public class Tp4Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = JOptionPane.showInputDialog(null,"Nombre de notes ");
		int nb_notes = Integer.parseInt(text);
		int moyenne = 0;
		float moyenne1 = moyenne;
		
		for(int i = 1;i <= nb_notes;i++) {
			String chaine = JOptionPane.showInputDialog(null,"note " + i);
			int note = Integer.parseInt(chaine);
			moyenne1 += note ;
			}
		JOptionPane.showMessageDialog(null,"La moyenne de ces "+nb_notes+"\n"+" est : "+(moyenne1/nb_notes));
				
				//" est " + (moyenne1 /nb_notes));

		}
	

}
