import java.awt.*;

import javax.swing.*;

public class Ex01_goodThingIStudied {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(285, 200));
		frame.setTitle("Good thing I studied!");
		
		frame.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel(new GridLayout(1,3));
		for (int i = 1; i <= 3; i++) {
			northPanel.add(new JButton("Button" + i));
		}
		frame.add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel(new GridLayout(2, 2));
		for (int i = 1; i <= 4; i++) {
			centerPanel.add(new JButton("Button" + (i+3)));
		}
		frame.add(centerPanel, BorderLayout.CENTER);
		
		JPanel southPanel = new JPanel(new FlowLayout());
		southPanel.add(new JLabel("Type stuff: ")); 
		southPanel.add(new JTextField(10));
		frame.add(southPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);	
		

	}
}
