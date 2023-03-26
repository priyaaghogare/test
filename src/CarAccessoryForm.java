

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarAccessoryForm extends JFrame {
    private JComboBox<String> productComboBox;
    private JLabel quantityLabel;
    private JTextField quantityField;
    private JButton sellButton;

    public CarAccessoryForm() {
        super("Car Accessory Form");

        // Create product list
        String[] products = {"LED Screen", "Glass", "Doors"};
        productComboBox = new JComboBox<>(products);

        // Create quantity field
        quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField(10);

        // Create sell button
        sellButton = new JButton("Sell");
        sellButton.addActionListener(new SellButtonListener());

        // Create layout
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Product:"));
        add(productComboBox);
        add(quantityLabel);
        add(quantityField);
        add(new JLabel());
        add(sellButton);

        // Display window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    private class SellButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String product = (String) productComboBox.getSelectedItem();
            int quantity = Integer.parseInt(quantityField.getText());

            // Update product quantity and display message
            String message = "";
            if (product.equals("LED Screen")) {
                message = "Sold " + quantity + " LED screens.";
            } else if (product.equals("Glass")) {
                message = "Sold " + quantity + " pieces of glass.";
            } else if (product.equals("Doors")) {
                message = "Sold " + quantity + " doors.";
            }
            JOptionPane.showMessageDialog(CarAccessoryForm.this, message);
        }
    }

    public static void main(String[] args) {
        CarAccessoryForm form = new CarAccessoryForm();
    }
}