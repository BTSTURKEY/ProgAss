package brainBusterGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenuGUI {

	private JFrame frame;
	private JPanel panel;
	private JLabel title;
	private JLabel logo;
	private JButton play;
	private JButton exit;

	public MainMenuGUI(){
		createForm();
		addLabels();
		addButtons();

		frame.add(panel);
		frame.setVisible(true);
	}

	public void createForm() { 
		frame = new JFrame();
		frame.setTitle("Brain Buster Quiz Game");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
	}

	public void addLabels() { 

		title = new JLabel("Brain Buster");
		title.setBounds(200,0,150,100);
		panel.add(title);

		logo = new JLabel("Logo");
		logo.setBounds(200,100,100,70);
		panel.add(logo);
	}

	public void addButtons() {
		play = new JButton ("Play Game");
		play.setBounds(200,200,100,20);
		play.addActionListener(new choseGame());
		panel.add(play);

		exit = new JButton ("Exit");
		exit.setBounds(200,250,100,20);
		exit.addActionListener(new ExitHandler());
		panel.add(exit);
	}

	class choseGame implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			new OptionsScreenGUI();
		}
	}

	class ExitHandler implements ActionListener { 

		@Override
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	}
}
