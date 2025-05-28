package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler handlerSms = new HandlerSMS();
        Handler handlerEmail = new HandlerEmail();
        Handler handlerManager = new HandlerManager();

        handlerSms.setUrmatorulHandler(handlerEmail);
        handlerEmail.setUrmatorulHandler(handlerManager);

        Client client = new Client("Daria","07534253","@yahoo.com");
        Client client2 = new Client("Andreea","@gmail.com");
        Client client3 = new Client("Diana");

        handlerSms.notificaClient(client," WOW REDUCERI LA ORICE");
        handlerSms.notificaClient(client2," WOW nimic");
        handlerSms.notificaClient(client3," PRETURI MICI MICI");


    }
}