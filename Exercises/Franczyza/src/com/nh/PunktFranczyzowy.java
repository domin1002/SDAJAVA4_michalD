package com.nh;

public class PunktFranczyzowy {
    private String miasto;
    private String typ;
    private String skrotNazwy;
    private String oddzial;
    private String adres;
    private String osobaKontaktowa;
    private String email;
    private String nrTelefonu;

    public PunktFranczyzowy() {
    }

    public PunktFranczyzowy(String miasto, String typ, String skrotNazwy, String oddzial, String adres, String osobaKontaktowa, String email, String nrTelefonu) {
        this.miasto = miasto;
        this.typ = typ;
        this.skrotNazwy = skrotNazwy;
        this.oddzial = oddzial;
        this.adres = adres;
        this.osobaKontaktowa = osobaKontaktowa;
        this.email = email;
        this.nrTelefonu = nrTelefonu;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getSkrotNazwy() {
        return skrotNazwy;
    }

    public void setSkrotNazwy(String skrotNazwy) {
        this.skrotNazwy = skrotNazwy;
    }

    public String getOddzial() {
        return oddzial;
    }

    public void setOddzial(String oddzial) {
        this.oddzial = oddzial;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getOsobaKontaktowa() {
        return osobaKontaktowa;
    }

    public void setOsobaKontaktowa(String osobaKontaktowa) {
        this.osobaKontaktowa = osobaKontaktowa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public String toString() {
        return "PunktFranczyzowy{" +
                "miasto='" + miasto + '\'' +
                ", typ='" + typ + '\'' +
                ", skrotNazwy='" + skrotNazwy + '\'' +
                ", oddzial='" + oddzial + '\'' +
                ", adres='" + adres + '\'' +
                ", osobaKontaktowa='" + osobaKontaktowa + '\'' +
                ", email='" + email + '\'' +
                ", nrTelefonu=" + nrTelefonu +
                '}';
    }
}
