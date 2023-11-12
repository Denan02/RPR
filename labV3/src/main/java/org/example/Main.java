package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<String, String>();
        a.put("Sarajevo", "Bosna i Hercegovina");
        a.put("Beograd", "Republika Srbija");
        a.put("Zagreb","Republika Hrvatska");
        System.out.println(a.get("Beograd"));
    }
}