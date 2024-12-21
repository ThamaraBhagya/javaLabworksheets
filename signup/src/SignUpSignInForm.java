import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.regex.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpSignInForm {
    public static void main(String[] args) {

        // Database connection details
        final String DB_URL = "jdbc:mysql://127.0.0.1:3306/signed_db";
        final String USER = "root";
        final String PASS = "8520";

        // Create frame
        JFrame frame = new JFrame("Sign Up and Sign In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(460, 580);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // Sign Up Section
        JLabel signUpLabel = new JLabel("Sign Up");
        signUpLabel.setFont(new Font("Arial", Font.BOLD, 18));
        signUpLabel.setBounds(180, 10, 100, 30);
        signUpLabel.setForeground(Color.BLUE);
        frame.add(signUpLabel);

        // Name
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 50, 100, 20);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 25);
        frame.add(nameField);

        // Email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50, 90, 100, 20);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 90, 200, 25);
        frame.add(emailField);

        // Gender
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50, 130, 100, 20);
        frame.add(genderLabel);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(150, 130, 80, 20);
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(230, 130, 80, 20);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        frame.add(maleButton);
        frame.add(femaleButton);

        // Birthday
        JLabel birthdayLabel = new JLabel("Birthday");
        birthdayLabel.setBounds(50, 170, 100, 20);
        frame.add(birthdayLabel);

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        JComboBox<String> dayComboBox = new JComboBox<>(days);
        dayComboBox.setBounds(150, 170, 50, 25);

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(210, 170, 100, 25);

        String[] years = new String[101]; // 101 elements for years from 1920 to 2020
        for (int i = 1920; i <= 2020; i++) {
            years[i - 1920] = String.valueOf(i);
        }

        JComboBox<String> yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(320, 170, 70, 25);

        frame.add(dayComboBox);
        frame.add(monthComboBox);
        frame.add(yearComboBox);

        // Password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 210, 100, 20);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 210, 200, 25);
        frame.add(passwordField);

        // Captcha Checkbox
        JCheckBox captchaCheckBox = new JCheckBox("I am not a robot");
        captchaCheckBox.setBounds(150, 250, 200, 25);
        frame.add(captchaCheckBox);

        // Sign Up Button
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(30, 290, 400, 30); // Full width of the frame
        signUpButton.setBackground(Color.BLUE); // Set background color to blue
        signUpButton.setForeground(Color.WHITE); // Set text color to white
        signUpButton.setFocusPainted(false); // Remove focus border
        frame.add(signUpButton);

        // Reset Button
        JButton resetButton = new JButton("Clear");
        resetButton.setBounds(30, 330, 400, 30);
        resetButton.setBackground(Color.LIGHT_GRAY); // Set background color to red
        resetButton.setForeground(Color.BLACK); // Set text color to white
        resetButton.setFocusPainted(false); // Remove focus border
        frame.add(resetButton);

        // Reset Button Action
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear all fields
                nameField.setText("");
                emailField.setText("");
                genderGroup.clearSelection(); // Deselect gender radio buttons
                passwordField.setText(""); // Clear password field
            }
        });

        // Sign In Section
        JLabel signInLabel = new JLabel("Sign In");
        signInLabel.setFont(new Font("Arial", Font.BOLD, 18));
        signInLabel.setBounds(180, 365, 100, 30);
        signInLabel.setForeground(Color.BLUE);
        frame.add(signInLabel);

        // Email
        JLabel signInEmailLabel = new JLabel("Email");
        signInEmailLabel.setBounds(50, 400, 100, 20);
        frame.add(signInEmailLabel);

        JTextField signInEmailField = new JTextField();
        signInEmailField.setBounds(150, 400, 200, 25);
        frame.add(signInEmailField);

        // Password
        JLabel signInPasswordLabel = new JLabel("Password");
        signInPasswordLabel.setBounds(50, 440, 100, 20);
        frame.add(signInPasswordLabel);

        JPasswordField signInPasswordField = new JPasswordField();
        signInPasswordField.setBounds(150, 440, 200, 25);
        frame.add(signInPasswordField);

        // Sign In Button
        JButton signInButton = new JButton("Sign In");
        signInButton.setBounds(30, 490, 400, 30);
        signInButton.setBackground(Color.BLUE); // Set background color to blue
        signInButton.setForeground(Color.WHITE); // Set text color to white
        signInButton.setFocusPainted(false);
        frame.add(signInButton);


        // Sign Up Button Action
        signUpButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String gender = maleButton.isSelected() ? "Male" : (femaleButton.isSelected() ? "Female" : "");
            String day = (String) dayComboBox.getSelectedItem();
            String month = (String) monthComboBox.getSelectedItem();
            String year = (String) yearComboBox.getSelectedItem();
            String password = new String(passwordField.getPassword());

            if (name.isEmpty() || email.isEmpty() || gender.isEmpty() || password.isEmpty() || !captchaCheckBox.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String birthday = year + "-" + (monthComboBox.getSelectedIndex() + 1) + "-" + day;

            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (name, email, gender, birthday, password) VALUES (?, ?, ?, ?, ?)")) {

                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, gender);
                stmt.setString(4, birthday);
                stmt.setString(5, password);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(frame, "Sign Up Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error signing up. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Sign In Button Action
        signInButton.addActionListener(e -> {
            String email = signInEmailField.getText();
            String password = new String(signInPasswordField.getPassword());

            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?")) {

                stmt.setString(1, email);
                stmt.setString(2, password);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(frame, "Sign In Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Email or Password.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error signing in. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Set frame visible
        frame.setVisible(true);
    }
}
