package Currency;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class CurrencyApplication {
    private JTextField txtAmount;
    private JComboBox cbToCurrency;
    private JTextField txtResult;
    private JButton btnConvert;
    private JTextField malaysianRinggitMYRTextField;
    private JPanel panel;

    public CurrencyApplication() {
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double converted = 1.0;
                Double Amount = Double.parseDouble(txtAmount.getText());

                if (cbToCurrency.getSelectedItem().toString().equalsIgnoreCase("US Dollar, USD"))
                {
                    converted = Amount * 0.24;
                }
                else if (cbToCurrency.getSelectedItem().toString().equalsIgnoreCase("Euro, EUR"))
                {
                    converted = Amount * 0.21;
                }
                else if (cbToCurrency.getSelectedItem().toString().equalsIgnoreCase("British Pound, GBP"))
                {
                    converted = Amount * 0.18;
                }
                else if (cbToCurrency.getSelectedItem().toString().equalsIgnoreCase("Japanese Yen, JPY"))
                {
                    converted = Amount * 27.40;
                }
                else if (cbToCurrency.getSelectedItem().toString().equalsIgnoreCase("South Korean Won, KRW"))
                {
                    converted = Amount * 283.62;
                }
                else
                {
                    converted = Amount;
                }

                txtResult.setText(String.valueOf(converted));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CurrentApplication");
        frame.setContentPane(new CurrencyApplication().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
