package com.codedifferently.walkthrough.vendingmachine.menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> selection;

    public Menu(ArrayList<String> optionsIn) {
        this.selection = optionsIn;
    }

    public ArrayList<String> getSelection() {
        return selection;
    }
}
