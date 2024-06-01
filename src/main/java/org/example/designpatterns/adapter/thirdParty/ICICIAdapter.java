package org.example.designpatterns.adapter.thirdParty;

import org.example.designpatterns.adapter.BankAPI;
import org.example.designpatterns.adapter.thirdParty.icicibank.ICICIBank;

public class ICICIAdapter implements BankAPI {
    private ICICIBank iciciBank = new ICICIBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public Double getBalance(String accountNumber) {
        return null;
    }
}
