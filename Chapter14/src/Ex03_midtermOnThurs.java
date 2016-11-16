import java.awt.*;
import javax.swing.*;

public class Ex03_midtermOnThurs {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(400, 300));
		frame.setTitle("Midterm on Thursday!");
		frame.setLayout(new BorderLayout());

		JPanel westPanel = new JPanel();
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));
		westPanel.add(new JButton("Now Playing"));
		westPanel.add(new JButton("Media Guide"));
		westPanel.add(new JButton("Library"));
		westPanel.add(new JButton("Help & info"));
		westPanel.add(new JButton("Services"));
		frame.add(westPanel, BorderLayout.WEST);

		JPanel centerPanel = new JPanel(new BorderLayout());
		JTextArea area = new JTextArea();
		centerPanel.add(area);
		frame.add(centerPanel, BorderLayout.CENTER);

		JPanel eastPanel = new JPanel(new BorderLayout());
		JPanel butPanel = new JPanel(new GridLayout(2, 2));
		for (int i = 0; i < 4; i++) {
			butPanel.add(new JButton("" + i));
			eastPanel.add(butPanel, BorderLayout.NORTH);
		}
		eastPanel.add(new JButton("OK"));
		frame.add(eastPanel, BorderLayout.EAST);

		JPanel southPanel = new JPanel(new FlowLayout(1, 30, 10));
		southPanel.add(new JLabel("Movies"));
		southPanel.add(new JLabel("Music"));
		southPanel.add(new JLabel("Videos"));
		southPanel.add(new JLabel("DVD"));
		southPanel.add(new JLabel("Web Pages"));
		frame.add(southPanel, BorderLayout.SOUTH);

		frame.setVisible(true);
	}

}
