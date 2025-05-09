package main;

//Transmiterea notificărilor către clienții fideli se realizează prin mesaje SMS
//sau prin e-mail.
// Problema este că agenția deține pentru anumiți clienți numărul de
//telefon, iar pentru alți clienți doar adresa de mail. Să se implementeze
//funcționalitatea de a trimite notificări clienților prin **SMS**, iar în cazul în care
//pentru anumiți clienți agenția nu are în baza de date numărul de telefon,
//să se trimită notificarea prin **email**. În cazul clienților pentru care nu există
//nici numărul de telefon, nici adresa de mail, se trimite **managerului**
//agenției o notificare cu numele clientului pentru care nu există date de
//contact.

import clase.*;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorMail = new NotificatorMail();
        Notificator notificatorSMS = new NotificatorTelefon();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorMail);
        notificatorMail.setUrmatorulNotificator(notificatorManager);

        Client client = new Client("Daria","072537201","daria@test.com");
        Client client2 = new Client("Andreea","andreea@test.com");
        Client client3 = new Client("Ruxi");
        notificatorSMS.notificaClient(client,"MESAJ PENTRU CLIENT !!");
        notificatorSMS.notificaClient(client2,"MESAJ PENTRU CLIENT !!");
        notificatorSMS.notificaClient(client3,"MESAJ PENTRU CLIENT !!");
    }
}