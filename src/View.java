import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.BorderFactory;

public class View extends JFrame {
	private JPanel _winPanel = new JPanel();
	private JPanel _informations = new JPanel();
	private JPanel _selector = new JPanel();;
	
	public View () {
		System.out.println("View constructor WOJ project");
	}
	
	public int initView() {
		System.out.println("inside init viewx WOJ project");

		this.setWindow();
		
		this.getWinInfo();
		return (0);
	}
	
	public int getWinInfo() {
		System.out.println("-> information oin the UI <-");
		System.out.println(" | " + this.getSize().getWidth() + "  " + this.getSize().getHeight()   + " | " );
		return 0;
	}
	
	public int setWindow() {
		
		this.setTitle("Bonjour");
		this.setSize(400, 250);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
	    _informations.setBorder(BorderFactory.createLineBorder(Color.RED));
	    _selector.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	    
	    _winPanel.add(_informations);
	    _winPanel.add(_selector);
	    setContentPane(_winPanel);
	    
	    /* ca c'est pour afficher la fenetre initialisé */
	    setVisible(true);
	    System.out.println("a la fin de set Window");
		return 0;
	}
}
