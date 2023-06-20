package com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<Contact> data = new ArrayList<>();

    public void saveContact(Contact contact) {
        data.add(contact);
    }

    public List<Contact> getData() {
        return data;
    }

    public void deleteContact(int index) {
        data.remove(index);
    }

    public Contact getContactByIndex(int index) {
        return data.get(index);
    }

    public void duplicateContact(int index) {
        saveContact(new Contact(getContactByIndex(index)));
    }
}
