import sun.security.util.Password;

import javax.swing.*;
import java.awt.*;

public class Autorization {
    JFrame login ,listAbonent;
    JTextField textLogin;
    JPasswordField textPassword;

    public Autorization(Controller controller) {
        createLoginFrame(controller);
    }
    private void createLoginFrame(Controller controller){
        login = new JFrame();

        JPanel panel = new JPanel();

        textLogin = new JTextField(30);
        textLogin.setBounds(140,20,100,25);
        textPassword = new JPasswordField(30);
        textPassword.setBounds(140,60,100,25);

        JLabel labelLogin = new JLabel("Логин: ");
        labelLogin.setBounds(20,20,100,25);
        JLabel labelPassword = new JLabel("Пароль: ");
        labelPassword.setBounds(20,60,100,25);


        JButton btnOk = new JButton("OK");
        btnOk.setBounds(20,100,100,30);
        btnOk.setActionCommand("OK");
        btnOk.addActionListener(controller);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(150,100,100,30);
        btnCancel.setActionCommand("cancel");
        btnCancel.addActionListener(controller);


        panel.add(labelLogin);
        panel.add(labelPassword);

        panel.add(textLogin);
        panel.add(textPassword);

        panel.add(btnOk);
        panel.add(btnCancel);
        panel.setLayout(null);


        login.add(panel);

        login.setResizable(false);
        login.setBounds(200,200,270,200);
        login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        login.setVisible(true);

    }
    public String getLogin(){
        return textLogin.getText();
    }
    public String getPassword(){
        return textPassword.getText();
    }
    public void setVisible(Boolean value){
        login.setVisible(value);
    }

}
