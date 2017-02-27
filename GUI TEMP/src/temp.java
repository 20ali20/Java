import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class temp implements ActionListener {

JFrame frame;
JPanel panel;
JTextField fahrenheitText;
JLabel celLabel, fahLabel;
JButton changeTemp;
JTextField celciusText;

public temp() {

frame = new JFrame("Change Celsius to Fahrenheit");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(new Dimension(180, 80));

panel = new JPanel(new GridLayout(3, 2));
panel.setBorder(BorderFactory.createEmptyBorder(60, 
60, 
20,
60)
);
addItems();
frame.getRootPane().setDefaultButton(changeTemp);
frame.getContentPane().add(panel, BorderLayout.CENTER);
frame.pack();
frame.setVisible(true);
}
private void addItems() {
fahLabel = new JLabel("Fahrenheit", SwingConstants.LEFT);
fahrenheitText = new JTextField(20);

changeTemp = new JButton("Convert");
celLabel = new JLabel("Celcius", SwingConstants.LEFT);
celciusText = new JTextField(20);

changeTemp.addActionListener(this);
panel=new JPanel(new GridLayout(4,1));
panel.add(fahLabel);
panel.add(fahrenheitText);
panel.add(celLabel);
panel.add(celciusText);
panel.add(changeTemp);

celLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
fahLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
}
public void actionPerformed(ActionEvent event) {
String selected=fahrenheitText.getText();
if (selected.equals("")){
celciusText.setText("");
System.out.println("enter the fahrenheit value");
JOptionPane.showMessageDialog(null,"Enter the fahrenheit value");
}
else{
double f = Double.parseDouble(selected);
double c = (f - 32) / 1.8;
celciusText.setText(Double.toString(c));
}
}
private static void createAndShowGUI() {
JFrame.setDefaultLookAndFeelDecorated(true);
temp converter = new temp();
}
public static void main(String[] args) {
javax.swing.SwingUtilities.invokeLater(new Runnable() {
public void run() {
createAndShowGUI();
}
});
}
}
