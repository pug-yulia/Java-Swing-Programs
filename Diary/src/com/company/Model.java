package com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<String> data = new ArrayList<>();

    public void saveNote(String string) {
        data.add(string);
    }

    public String getNote(int currentIndex) {
        return data.get(currentIndex);
    }

    public int getLength() {
        return data.size();
    }
}
