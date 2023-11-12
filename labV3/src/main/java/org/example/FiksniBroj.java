package org.example;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private String broj;
    private Grad gradKantona;

    public FiksniBroj( Grad gradKantona, String broj) {
        this.broj = broj;
        this.gradKantona = gradKantona;
    }

    @Override
    public String ispisi() {
        String vrati = new String();
        if (gradKantona == Grad.SARAJEVO)
            vrati = "033/"+broj;
        else if(gradKantona == Grad.ZENICA)
            vrati = "035/"+broj;
        else if(gradKantona == Grad.TUZLA)
            vrati = "036/"+broj;
        return vrati;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradKantona, broj);
    }
}
