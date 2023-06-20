package com.company;

import javax.swing.*;
import java.awt.*;

public class View {
    private Controller controller;
    private JTextArea textArea;
    private JLabel label;

    public void create() {
        JFrame frame = new JFrame();
        frame.setSize(600, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFFE6B3));

        label = new JLabel("0/0");
        label.setBounds(345, 375, 50, 50);
        frame.add(label);

        textArea = new JTextArea();
        textArea.setBounds(50, 50, 500, 250);
        frame.add(textArea);

        JButton backButton = new JButton("<- back");
        backButton.setBounds(50, 375, 100, 50);
        frame.add(backButton);
        backButton.addActionListener(e -> controller.handleBackButtonClick());

        JButton forwardButton = new JButton("forward ->");
        forwardButton.setBounds(170, 375, 100, 50);
        frame.add(forwardButton);
        forwardButton.addActionListener(e -> controller.handleForwardButtonClick());

        JButton saveButton = new JButton("save");
        saveButton.setBounds(450, 375, 100, 50);
        saveButton.addActionListener(e -> controller.handleSaveButtonClick());
        frame.add(saveButton);


        frame.setVisible(true);
    }

    public String getText() {
        return textArea.getText();
    }

    public void setText(String string) {
        textArea.setText(string);
    }

    public void setLabelText(String string) {
        label.setText(string);
    }

    public void clearArea() {
        textArea.setText("");
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void moveCursor() {
        textArea.requestFocus();
        textArea.setCaretPosition(0);
    }
}
