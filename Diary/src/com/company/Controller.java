package com.company;

public class Controller {
    private View view;
    private Model model;
    private int currentIndex = 0;

    public void start() {
        view.create();
    }

    public void handleSaveButtonClick() {
        model.saveNote(view.getText());
        view.clearArea();
        currentIndex = model.getLength();
        setLabel(currentIndex, model.getLength());
        view.moveCursor();
    }

    public void handleBackButtonClick() {
        if (currentIndex == 0) {
            return;
        }
        currentIndex--;
        update();
    }

    public void handleForwardButtonClick() {
        if (currentIndex == model.getLength() - 1) {
            view.clearArea();
            setLabel(currentIndex + 1, model.getLength());
        } else {
            currentIndex++;
            update();
        }
    }

    private void update() {
        view.setText(model.getNote(currentIndex));
        setLabel(currentIndex, model.getLength());
    }

    private void setLabel(int pageIndex, int pagesTotal) {
        view.setLabelText(pageIndex + 1 + "/" + pagesTotal);
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
