package J29_1;

public class Pracownicy {
    private String imie;
    private String nazwisko;
    private String kontakt;//etat staz
    private String pensja;

    public Pracownicy(String imie, String nazwisko, String kontakt, String pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kontakt = kontakt;
        this.pensja = pensja;
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKontakt() {
        return this.kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public String getPensja() {
        return this.pensja;
    }

    public void setPensja(String pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "imie='" + this.imie + '\'' +
                ", nazwisko='" + this.nazwisko + '\'' +
                ", kontakt='" + this.kontakt + '\'' +
                ", pensja='" + this.pensja + '\'' +
                '}';
    }
}
