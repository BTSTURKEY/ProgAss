package brainBusterGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionsScreenGUI {

	private JFrame frame;
	private JPanel panel;
	private JLabel title;
	private JButton movie;
	private JButton geography;
	private JButton science;
	private JButton ultimate;
	private JButton exit;

	public OptionsScreenGUI(){
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

		title = new JLabel("Chose a Category");
		title.setBounds(200,0,150,100);
		panel.add(title);
	}

	public void addButtons() {
		movie = new JButton ("Movies");
		movie.setBounds(200,100,100,20);
		movie.addActionListener(new PlayMovies());
		panel.add(movie);

		geography = new JButton ("Geography");
		geography.setBounds(200,150,100,20);
		geography.addActionListener(new PlayGeography());
		panel.add(geography);

		science = new JButton ("science");
		science.setBounds(200,200,100,20);
		science.addActionListener(new PlayScience());
		panel.add(science);

		ultimate = new JButton ("ultimate");
		ultimate.setBounds(200,250,100,20);
		ultimate.addActionListener(new PlayUltimate());
		panel.add(ultimate);

		exit = new JButton ("Go Back");
		exit.setBounds(200,300,100,20);
		exit.addActionListener(new ReturnHandler());
		panel.add(exit);
	}
	
	class PlayMovies implements ActionListener { 

		@Override
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			new QuizScreenGUI();
		}
	}

	class PlayGeography implements ActionListener { 

		@Override
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			new QuizScreenGUI();
		}
	}
	
	class PlayScience implements ActionListener { 

		@Override
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			new QuizScreenGUI();
		}
	}
	
	class PlayUltimate implements ActionListener { 

		@Override
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			new QuizScreenGUI();
		}
	}
	
	class ReturnHandler implements ActionListener { 

		@Override
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			new MainMenuGUI();
		}
	}
}
