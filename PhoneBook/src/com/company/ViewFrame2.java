package com.company;

import javax.swing.*;
import java.awt.*;

public class ViewFrame2 {
    private ControllerFrame2 controller2;
    private JFrame frame;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField phoneField;

    public void create() {
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setLocation(720, 200);
        frame.getContentPane().setBackground(new Color(0x93C572));

        JLabel contactLabel = new JLabel("New Contact: ");
        contactLabel.setBounds(200, 30, 100, 50);
        frame.add(contactLabel);

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(70, 100, 100, 50);
        frame.add(nameLabel);

        JLabel surnameLabel = new JLabel("Surname: ");
        surnameLabel.setBounds(70, 175, 100, 50);
        frame.add(surnameLabel);

        JLabel phoneLabel = new JLabel("Phone number: ");
        phoneLabel.setBounds(70, 250, 100, 50);
        frame.add(phoneLabel);

        nameField = new JTextField();
        nameField.setBounds(230, 100, 200, 50);
        frame.add(nameField);

        surnameField = new JTextField();
        surnameField.setBounds(230, 175, 200, 50);
        frame.add(surnameField);

        phoneField = new JTextField();
        phoneField.setBounds(230, 250, 200, 50);
        frame.add(phoneField);

        JButton addContactButton = new JButton("Save Contact");
        addContactButton.setBounds(260, 400, 100, 50);
        addContactButton.addActionListener(e -> controller2.handleSaveContactButtonClick());
        frame.add(addContactButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(140, 400, 100, 50);
        exitButton.addActionListener(e -> controller2.handleExitButtonClick());
        frame.add(exitButton);

        frame.setVisible(true);
    }

    public void disposeFrame() {
        frame.dispose();
    }

    public void setController2(ControllerFrame2 controller2) {
        this.controller2 = controller2;
    }

    public String getNameField() {
        return nameField.getText();
    }

    public String getSurnameField() {
        return surnameField.getText();
    }

    public String getPhoneField() {
        return phoneField.getText();
    }

    public void clearAllFields() {
        nameField.setText("");
        surnameField.setText("");
        phoneField.setText("");
    }

    public void setContactInfo(String name, String surname, String phone) {
        nameField.setText(name);
        surnameField.setText(surname);
        phoneField.setText(phone);
    }
}
