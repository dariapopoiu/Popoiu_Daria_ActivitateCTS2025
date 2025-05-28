package main;

import clase.StudentSingletonEager;
import clase.StudentSingletonLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentSingletonEager studentEager = StudentSingletonEager.getInstance();
        studentEager.setMaterie("CTS");
        StudentSingletonEager studentEager2 = StudentSingletonEager.getInstance();

        System.out.println(studentEager);
        System.out.println(studentEager2);

        StudentSingletonLazy studentLazy = StudentSingletonLazy.getInstance("Daria","CTS",10);
        StudentSingletonLazy studentLazy2 = StudentSingletonLazy.getInstance("Alina","CTS",10);

        System.out.println(studentLazy);
        System.out.println(studentLazy2);

    }
}