package org.example;

import java.util.Objects;

public class MedjunarodniBroj extends TelefonskiBroj{
    String drzava, broj;

    public MedjunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava,broj);
    }

    @Override
    public String ispisi() {
        return drzava + "/" + broj;
    }
}
