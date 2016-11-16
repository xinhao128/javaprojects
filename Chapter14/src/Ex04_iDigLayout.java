import java.awt.*;

import javax.swing.*;

public class Ex04_iDigLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(400, 300));
		frame.setTitle("I Dig Layout");
		frame.setLayout(new BorderLayout());

		JPanel textPanel = new JPanel(new BorderLayout());
		textPanel.add(new JButton("1"), BorderLayout.WEST);
		textPanel.add(new JTextField(30));

		JPanel northPanel = new JPanel(new GridLayout(3, 1));
		northPanel.add(new JButton("2"));
		northPanel.add(textPanel);
		northPanel.add(new JButton("3"));
		frame.add(northPanel, BorderLayout.NORTH);

		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.add(new JButton("5"), BorderLayout.SOUTH);
		JPanel topPanel = new JPanel(new FlowLayout());

		topPanel.add(new JButton("6"), BorderLayout.NORTH);
		topPanel.add(new JButton("7"), BorderLayout.NORTH);

		JPanel centerPanel = new JPanel(new GridLayout(2, 2));
		centerPanel.add(new JButton("4"));
		centerPanel.add(bottomPanel);
		centerPanel.add(topPanel);
		centerPanel.add(new JButton("8"));
		frame.add(centerPanel, BorderLayout.CENTER);

		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(new JLabel("Pretty tricky!"), BorderLayout.WEST);
		frame.add(southPanel, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
}
