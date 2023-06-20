package com.company;

import java.util.List;

public class Controller {
    private View view;
    private Model model;
    private ViewFrame2 frame2;
    private ControllerFrame2 controllerFrame2;

    public void start() {
        view.create();
    }

    public void handleNewContactButtonClick() {
        view.changeLocation(200, 200);

        frame2 = new ViewFrame2();
        controllerFrame2 = new ControllerFrame2();

        frame2.setController2(controllerFrame2);
        controllerFrame2.setViewFrame2(frame2);
        controllerFrame2.setController(this);
        controllerFrame2.setModel(model);

        controllerFrame2.start();
    }

    public void handleDeleteButtonClick() {
        model.deleteContact(view.getContactIndex());
        setListDataMethod();
    }

    public void handleEditButtonClick() {
        view.changeLocation(200, 200);

        frame2 = new ViewFrame2();
        controllerFrame2 = new ControllerFrame2(model.getContactByIndex(view.getContactIndex()));

        frame2.setController2(controllerFrame2);
        controllerFrame2.setViewFrame2(frame2);
        controllerFrame2.setController(this);
        controllerFrame2.setModel(model);

        controllerFrame2.start();
    }

    public void handleDuplicateButtonClick() {
        model.duplicateContact(view.getContactIndex());
        setListDataMethod();
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setListDataMethod() {
        List<Contact> list = model.getData();
        String[] data = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            data[i] = 1 + i + ". " + list.get(i);
        }

        view.setListDataMethod(data);
    }

    public void changeLocationRelativeTo() {
        view.changeLocationRelativeTo();
    }
}
