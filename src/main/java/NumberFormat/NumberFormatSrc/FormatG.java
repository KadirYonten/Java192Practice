import java.awt.FlowLayout;
import java.awt.Font;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormatG {
  public static void main(String args[]) throws Exception {

    JFrame frame = new JFrame("�ngiltere Para Birimi");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font font = new Font("SansSerif", Font.BOLD, 16);

    JLabel label;
    JFormattedTextField input;
    JPanel panel;

    BoxLayout layout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
    frame.setLayout(layout);

    Format currency = NumberFormat.getCurrencyInstance(Locale.UK);
    label = new JLabel("UK Currency:");
    input = new JFormattedTextField(currency);
    input.setValue(2424.50);
    input.setColumns(20);
    input.setFont(font);
    panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    panel.add(label);
    panel.add(input);
    frame.add(panel);

    frame.pack();
    frame.setVisible(true);
  }
}

