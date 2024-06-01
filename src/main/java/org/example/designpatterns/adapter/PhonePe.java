package org.example.designpatterns.adapter;

import org.example.designpatterns.adapter.thirdParty.ICICIAdapter;
import org.example.designpatterns.adapter.thirdParty.YesBankAdapter;

public class PhonePe {
    // Ideally here we should use Dependency Injection, or we can use Factory pattern to create the object
//    private static BankAPI bankAPI = new YesBankAdapter();
    private static BankAPI bankAPI = new ICICIAdapter();

//    public void sendMoney(String from, String to, int amount) {
//        bankAPI.sendMoney(from, to, amount);
//    }

    public static void main(String[] args) {
        bankAPI.sendMoney("123456", "45679", 1000);
    }

}

