import java.awt.*;

import javax.swing.*;

public class Ex02_layoutQuestion {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(420, 250));
		frame.setTitle("Good thing I studied!");
		frame.setLayout(new BorderLayout());

		JPanel westPanel = new JPanel();
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));
		westPanel.add(new JCheckBox("Bold"));
		westPanel.add(new JCheckBox("Italic"));
		westPanel.add(new JCheckBox("Underline"));
		westPanel.add(new JCheckBox("Strikeout"));
		frame.add(westPanel, BorderLayout.WEST);

		JPanel buttons = new JPanel(new GridLayout(1, 3));
		buttons.add(new JButton("hi"));
		buttons.add(new JButton("long name"));
		buttons.add(new JButton("bye"));

		JPanel northPanel = new JPanel(new BorderLayout());
		northPanel.add(new JLabel("Buttons:"), BorderLayout.WEST);
		northPanel.add(buttons);

		frame.add(northPanel, BorderLayout.NORTH);

		JPanel eastPanel = new JPanel(new GridLayout(2, 2));
		JPanel butPanel = new JPanel(new GridLayout(2, 2));
		for (int i = 1; i <= 6; i++) {
			if (i == 1 || i == 2) {
				eastPanel.add(new JButton("" + i));
			} else {
				butPanel.add(new JButton("" + i));
			}

		}
		eastPanel.add(butPanel);
		eastPanel.add(new JButton("" + 7));

		frame.add(eastPanel, BorderLayout.CENTER);

		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(new JButton("Cancel"));
		frame.add(southPanel, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
}
