import java.awt.*;

import javax.swing.*;

public class Ex05_composeMessage {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300, 200));
		frame.setTitle("Compose Message");
		frame.setLayout(new BorderLayout());
		
		JPanel toPanel = new JPanel(new BorderLayout());
		toPanel.add(new JLabel("To: "), BorderLayout.WEST);
		toPanel.add(new JTextField(30));
		
		JPanel ccPanel = new JPanel(new BorderLayout());
		ccPanel.add(new JLabel("CC:"), BorderLayout.WEST);
		ccPanel.add(new JTextField(30));
		
		JPanel northPanel = new JPanel(new GridLayout(2, 1));
		northPanel.add(toPanel); 
		northPanel.add(ccPanel);
		frame.add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel(new BorderLayout());
		JTextArea text = new JTextArea();
		centerPanel.add(text);
		frame.add(centerPanel, BorderLayout.CENTER);
		
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(new JButton("send"), BorderLayout.EAST);
		frame.add(southPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}
