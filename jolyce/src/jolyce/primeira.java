package jolyce;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class primeira implements ActionListener{
	
segunda sg = new segunda();
public int aluno = 190;
public int professores = 200;
public final static int HEIGHT = 800;
public static final int WIDTH = 800;
public static Rectangle passaro;
public int testando = 209;
JFrame jf = new JFrame();
Timer timer = new Timer();
JLabel lab = new JLabel();
JButton btn = new JButton();


	
	
primeira(){
		
	
	 passaro = new Rectangle(WIDTH / 2 - 10, HEIGHT /2 - 10, 20 , 20);
	 
	tela();
    contar();		
    btn.setText("Yes");
  
}
	
	
public void tela() {
	
	jf.add(sg);
	jf.setVisible(true);
	jf.setResizable(false);
	jf.setTitle("Ordem");
	jf.setSize(WIDTH, HEIGHT);
	
}


public static  void repaint(Graphics g) {

	
        g.setColor(Color.cyan);
	    g.fillRect(0, 0, WIDTH, HEIGHT);
	    
	    g.setColor(Color.blue);
	    g.fillRect(passaro.x, passaro.y, passaro.width, passaro.height);
	
}
	
@Override
public void actionPerformed(ActionEvent e) {
	
	
	sg.repaint();
	
	
}

public void contar() {
	
	
	if(aluno < professores) {
		

       System.out.println("sim!");
		
	};
	
}
	

	
	public static void main(String[] args) {
	
		
		       new primeira();
 
	}



}
