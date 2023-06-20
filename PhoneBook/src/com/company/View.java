package com.company;

import javax.swing.*;
import java.awt.*;

public class View {
    private Controller controller;
    private JFrame frame;
    private JList<String> list;

    public void create() {
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0x93C572));

        list = new JList<>();
        list.setBounds(50, 50, 400, 300);
        frame.add(list);

        JButton newContactButton = new JButton("New Contact");
        newContactButton.setBounds(200, 400, 100, 50);
        newContactButton.addActionListener(e -> controller.handleNewContactButtonClick());
        frame.add(newContactButton);

        JButton deleteButton = new JButton("Delete Contact");
        deleteButton.setBounds(50, 400, 150, 50);
        deleteButton.addActionListener(e -> controller.handleDeleteButtonClick());
        frame.add(deleteButton);

        JButton editButton = new JButton("Edit Contact");
        editButton.setBounds(300, 400, 150, 50);
        editButton.addActionListener(e -> controller.handleEditButtonClick());
        frame.add(editButton);

        JButton duplicateButton = new JButton("Duplicate Contact");
        duplicateButton.setBounds(300, 450, 150, 50);
        duplicateButton.addActionListener(e -> controller.handleDuplicateButtonClick());
        frame.add(duplicateButton);

        frame.setVisible(true);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void changeLocation(int x, int y) {
        frame.setLocation(x, y);
    }

    public void changeLocationRelativeTo() {
        frame.setLocationRelativeTo(null);
    }

    public void setListDataMethod(String[] data) {
        list.setListData(data);
    }

    public int getContactIndex() {
        return list.getSelectedIndex();
    }
}
