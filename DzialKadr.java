package J29_1;

import J29.Student;

import java.util.ArrayList;

public class DzialKadr {
    ArrayList<Pracownicy>listaPracownicy=new ArrayList<>();

    public void dodajPracownika(String imie,String nazwisko,String kontrakt,String pensja){
        Pracownicy pracownicy=new Pracownicy(imie,nazwisko,kontrakt,pensja);
        this.listaPracownicy.add(pracownicy);

    }
    public void pokazPracownikow(){
        for (Pracownicy x:this.listaPracownicy){
            System.out.println(x);

        }

    }
    public void usunPracownika(String nazwisko){
        for (Pracownicy x : this.listaPracownicy) {
            if (x.getNazwisko().equals(nazwisko)) {
                this.listaPracownicy.remove(x);
                break;
            }

        }

    }

    public void zmienKontrakt(String nazwisko,String kontrakt,String pensja){
        for (Pracownicy x : this.listaPracownicy) {
            if (x.getNazwisko().equals(nazwisko)) {
                x.setKontakt(kontrakt);
                if (x.getKontakt().equals("staz")) {
                    x.setPensja("1000");
                } else {

                    x.setPensja(pensja);
                }

            }
        }

    }

}
