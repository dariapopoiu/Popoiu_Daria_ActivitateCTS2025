package main;

import singleton.EventManagerEager;
import singleton.EventManagerLazy;
import singleton.EventManagerThreadSafe;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Control");
        list.add("Fabrica");

        EventManagerThreadSafe eventManagerThreadSafe=EventManagerThreadSafe.getInstance("IaBilet",140,list);
        System.out.println(eventManagerThreadSafe.getEventManagerName());

        EventManagerThreadSafe eventManagerThreadSafe2=EventManagerThreadSafe.getInstance("OnEvent",140,list);
        System.out.println(eventManagerThreadSafe2.getEventManagerName());

    }
}