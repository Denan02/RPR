package org.example;

public class MobilniBroj extends TelefonskiBroj{
    int moblinaMreza;
    String broj;

    public MobilniBroj(int moblinaMreza, String broj) {
        this.moblinaMreza = moblinaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return "0" + Integer.toString(moblinaMreza) + "/" + broj;
    }
}
