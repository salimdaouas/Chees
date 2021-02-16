package classesDedonnees;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class Fenetre1 extends JFrame {
private final static String title = "Xiangqi";
private Fenetre fen;
private Panneau1 pan = new Panneau1();

private bouton bouton1 = new bouton("Start");
public Fenetre1(){
   pan.setLayout(null);
   this.setTitle("jouer");
   this.setSize(400, 500);
   this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   this.setLocationRelativeTo(null);

   bouton1.setBackground(Color.cyan);
   bouton1.setBounds(200,150, 300, 200);
 
  pan.add(bouton1);   
    
                    
        setContentPane(pan);
        bouton1.addActionListener(this);
        this.setVisible(true);                            
}
private void setLocationRelativeTo(Object object) {
	// TODO Auto-generated method stub
	
}
private void setSize(int i, int j) {
	// TODO Auto-generated method stub
	
}
private void setTitle(String string) {
	// TODO Auto-generated method stub
	
}
public void actionPerformed(ActionEvent arg0) {
   //Lorsque nous cliquons sur notre bouton, on passe a l'autre fenétre
	fen = new Fenetre();
		this.dispose();
    
}             
}