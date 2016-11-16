import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SillyStringGame implements ActionListener {
	private JFrame frame;
	private JPanel upperPanel;
	private JPanel lowerPanel;
	private JPanel westPanel;
	private JTextField text;
	private JButton upperCase;
	private JButton lowerCase;

	public SillyStringGame() {
		upperPanel = new JPanel(new BorderLayout());
		upperCase = new JButton("Upper case");
		upperPanel.add(upperCase, BorderLayout.WEST);
		upperCase.addActionListener(this);

		lowerPanel = new JPanel(new BorderLayout());
		lowerCase = new JButton("Lower case");
		lowerPanel.add(lowerCase, BorderLayout.WEST);
		lowerCase.addActionListener(this);

		westPanel = new JPanel(new GridLayout(3, 1, 5, 5));
		westPanel.add(upperPanel);
		text = new JTextField(27);
		westPanel.add(text);
		westPanel.add(lowerPanel);

		frame = new JFrame("Silly String Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(320, 150));
		frame.setTitle("Silly String Game");
		frame.setLayout(new FlowLayout());
		frame.add(westPanel);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if (source == upperCase) {
			String upCase = text.getText().toUpperCase();
			text.setText(upCase);
		} else if (source == lowerCase) {
			String lowCase = text.getText().toLowerCase();
			text.setText(lowCase);
		}
	}

	public static void main(String[] args) {
		SillyStringGame game = new SillyStringGame();
	}
}
