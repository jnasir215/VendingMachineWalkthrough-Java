package com.codedifferently.walkthrough.vendingmachine.menu;

import java.util.ArrayList;

public class Purchase {
    private ArrayList<String> pOptions;
    private Double pMoney;

    public Purchase(ArrayList<String> pOptionsIn) {
        this.pOptions = pOptionsIn;
    }

    public Purchase(Double moneyIn) {
        this.pMoney = moneyIn;
    }

    public Double feedMoney(Double moneyIn) {
        return moneyIn;
    }

    //public void show() {
    //    ArrayList<String> pOptions = new ArrayList<>();
    //    pOptions.add("(1) Feed Money");
    //    pOptions.add("(2) Select Product");
    //    pOptions.add("(3) Finish Transaction");
    //
    //}

    public ArrayList<String> getpOptions() {
        return pOptions;
    }
}
