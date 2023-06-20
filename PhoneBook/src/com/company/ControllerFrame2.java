package com.company;

public class ControllerFrame2 {
    private ViewFrame2 viewFrame2;
    private Model model;
    private Controller controller;
    private Contact contact;

    public ControllerFrame2() {}

    public ControllerFrame2(Contact contact) {
        this.contact = contact;
    }

    public void start() {
        viewFrame2.create();
        if (isEditMode()) {
            viewFrame2.setContactInfo(contact.getName(), contact.getSurname(), contact.getPhone());
        }
    }

    public void handleSaveContactButtonClick() {
        if (isEditMode()) {
            contact.setName(viewFrame2.getNameField());
            contact.setSurname(viewFrame2.getSurnameField());
            contact.setPhone(viewFrame2.getPhoneField());
        } else {
            model.saveContact(getNewContact());
        }
        controller.setListDataMethod();
        viewFrame2.clearAllFields();
    }

    public void handleExitButtonClick() {
        controller.changeLocationRelativeTo();
        viewFrame2.disposeFrame();
    }

    public void setViewFrame2(ViewFrame2 viewFrame2) {
        this.viewFrame2 = viewFrame2;
    }

    public Contact getNewContact() {
        return new Contact(viewFrame2.getNameField(), viewFrame2.getSurnameField(), viewFrame2.getPhoneField());
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    private boolean isEditMode() {
        return contact != null;
    }
}
