package org.example.designpatterns.adapter.thirdParty.yesbank;

public class YesBank {
    public void transferMoney(int amount, String from, String to) {
        System.out.println("Transferring "+amount+" to " + to + " from "+from+ " via YES Bank!");
    }
}
