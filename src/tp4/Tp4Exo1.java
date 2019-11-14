package tp4;

import javax.swing.JOptionPane;
public class Tp4Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String text = JOptionPane.showInputDialog(null,"Nombre de notes ");
		int nb_notes = Integer.parseInt(text);
		float moyenne = 0;
		
		for(int i = 1;i <= nb_notes;i++) {
			String chaine = JOptionPane.showInputDialog(null,"note " + i);
			float note = Float.parseFloat(chaine);
			moyenne += note ;
			}
		JOptionPane.showMessageDialog(null,"note : "+nb_notes);
		JOptionPane.showMessageDialog(null,(moyenne/nb_notes));

		}
	

}
