package org.example.designpatterns.observer;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();

        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        InvoiceService invoiceService = new InvoiceService();

        flipkart.onOrderPlaced();

        flipkart.unregisterSubscriber(invoiceService);

        flipkart.onOrderPlaced();
    }
}
