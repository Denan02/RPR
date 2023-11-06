package org.example;

public class Main {
    public static void main(String[] args) {
        FiksniBroj f = new FiksniBroj(Grad.ZENICA, "645-053");
        System.out.println(f.ispisi());
        MobilniBroj m = new MobilniBroj(61, "242-050");
        System.out.println(m.ispisi());
    }
}