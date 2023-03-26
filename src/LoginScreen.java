import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginScreen extends JFrame implements ActionListener {

    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public LoginScreen() {
        setTitle("Login Screen");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 100, 30);
        panel.add(usernameLabel);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        panel.add(passwordLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 50, 200, 30);
        panel.add(usernameField);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 150, 100, 30);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(250, 150, 100, 30);
        cancelButton.addActionListener(this);
        panel.add(cancelButton);

        getContentPane().add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton)
        {
            String username1 = usernameField.getText();
            String password1 = new String(passwordField.getPassword());

           
            
            String url = "jdbc:mysql://Localhost:3306/logindata"; //replace with your database URL
            String username = "root"; //replace with your database username
            String password = "1234"; //replace with your database password
            
            try {
            	
            	
                //connect to the database
                Connection conn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/logindata","root","1234");
                
                //prepare a statement to retrieve data from the database
                String sql = "SELECT FROM records(username,password) VALUES(?,?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, 123); //replace with the input data you want to check
                
                //execute the query and retrieve the results
                ResultSet rs = stmt.executeQuery();
                
                //check if the input data matches the data stored in the database
                if (rs.next()) {
                    String dbData = rs.getString("username"); //replace with the column name that stores the data you want to check
                    String inputData = "password"; //replace with the input data you want to check
                    
                    if (dbData.equals(inputData)) {
                        System.out.println("Input data matches data stored in database.");
                    } else {
                        System.out.println("Input data does not match data stored in database.");
                    }
                } else {
                    System.out.println("No data found in database for the given input.");
                }
                
                //close the database resources
                rs.close();
                stmt.close();
                conn.close();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            
        } else if (ae.getSource() == cancelButton) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}
