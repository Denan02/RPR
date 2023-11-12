package org.example;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{
    int moblinaMreza;
    String broj;

    public MobilniBroj(int moblinaMreza, String broj) {
        this.moblinaMreza = moblinaMreza;
        this.broj = broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(moblinaMreza, broj);
    }

    @Override
    public String ispisi() {
        return "0" + Integer.toString(moblinaMreza) + "/" + broj;
    }
}
