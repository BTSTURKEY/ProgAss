package brainBusterGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class QuizScreenGUI {

	private JFrame frame;
	private JPanel panel;
	private JLabel title;
	private JLabel score;
	private JLabel picture;
	private JLabel question;
	private JButton option1;
	private JButton option2;
	private JButton option3;
	private JButton option4;
	private JProgressBar timer;

	public QuizScreenGUI(){
		createForm();
		addLabels();
		addButtons();
		addProgressBar();

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

		title = new JLabel("category");
		title.setBounds(200,10,150,100);
		panel.add(title);

		score = new JLabel("number");
		score.setBounds(100,10,150,100);
		panel.add(score);

		picture = new JLabel("picture");
		picture.setBounds(200,50,150,100);
		panel.add(picture);

		question = new JLabel("question");
		question.setBounds(200,100,150,100);
		panel.add(question);
	}

	public void addButtons() {
		option1 = new JButton ("option1");
		option1.setBounds(100,200,100,20);
		option1.addActionListener(new ReturnHandler());
		panel.add(option1);

		option2 = new JButton ("option2");
		option2.setBounds(200,200,100,20);
		option2.addActionListener(new ReturnHandler());
		panel.add(option2);

		option3 = new JButton ("option3");
		option3.setBounds(100,300,100,20);
		option3.addActionListener(new ReturnHandler());
		panel.add(option3);

		option4 = new JButton ("option4");
		option4.setBounds(200,300,100,20);
		option4.addActionListener(new ReturnHandler());
		panel.add(option4);
	}
	
	public void addProgressBar(){
		timer = new JProgressBar();
		timer.setBounds(200,0,150,100);
		panel.add(timer);
	}
	class ReturnHandler implements ActionListener { 

		@Override
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			new OptionsScreenGUI();
		}
	}
}