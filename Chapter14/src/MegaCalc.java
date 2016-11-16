import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MegaCalc implements ActionListener {
	private JFrame frame;
	private JPanel upperPanel;
	private JTextField num1;
	private JButton plus;
	private JButton minus;
	private JTextField num2;
	private JLabel result;
	private JButton clear;

	public MegaCalc() {

		upperPanel = new JPanel();
		num1 = new JTextField(5);
		num2 = new JTextField(5);
		plus = new JButton("+");
		minus = new JButton("-");
		plus.addActionListener(this);
		minus.addActionListener(this);
		upperPanel.add(num1);
		upperPanel.add(plus);
		upperPanel.add(minus);
		upperPanel.add(num2);

		result = new JLabel();

		frame = new JFrame("MegaCalc");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(400, 300));
		frame.setTitle("MegaCalc");
		frame.setLayout(new BorderLayout());
		frame.add(upperPanel, BorderLayout.NORTH);
		frame.add(result, BorderLayout.WEST);
		clear = new JButton("Clear");
		clear.addActionListener(this);
		frame.add(clear, BorderLayout.SOUTH);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		String numText1 = num1.getText();
		double firstNum = Double.parseDouble(numText1);
		String numText2 = num2.getText();
		double lastNum = Double.parseDouble(numText2);
		if (source == plus) {
			double sum = firstNum + lastNum;
			result.setText("" + sum);
		} else if (source == minus) {
			double diff = firstNum - lastNum;
			result.setText("" + diff);
		} else if (source == clear) {
			result.setText("0");
			num1.setText("");
			num2.setText("");
		}
	}

	public static void main(String[] args) {
		MegaCalc calc = new MegaCalc();
	}
}
