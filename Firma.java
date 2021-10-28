package J29_1;


import java.util.Scanner;

public class Firma extends DzialKadr{

    Scanner scanner = new Scanner(System.in);
    public String nazwaFirmy;

    public Firma(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
        this.menu();
    }

    public void menu(){

        boolean start=true;
        String imie1, nazwisko1, kontrakt1, pensja1;


        while(start) {
            System.out.println("Wita w firmie " + this.nazwaFirmy);
            System.out.println("1-dodaj, 2-pokaz, 3-usun, 4-zmien kontrakt, 5-koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {

                case 1:
                    System.out.println("Podaj imie pracownika: ");
                    imie1 = scanner.nextLine();
                    System.out.println("Podaj nazwisko pracownika: ");
                    nazwisko1 = scanner.nextLine();
                    System.out.println("Podaj kontrakt : staz, etat");
                    kontrakt1=scanner.nextLine();
                    System.out.println("Podaj pensje pracowniaka");
                    pensja1=scanner.nextLine();
                    this.dodajPracownika(imie1, nazwisko1, kontrakt1,pensja1);
                break;
                case 2:
                    this.pokazPracownikow();
                break;
                case 3:
                    System.out.println("Podaj nazwisko pracownika do usuniecia: ");
                    nazwisko1 = scanner.nextLine();
                    this.usunPracownika(nazwisko1);
                break;
                case 4:
                    System.out.println("Podaj nazwisko pracownika: ");
                    nazwisko1 = scanner.nextLine();
                    System.out.println("Podaj kontrakt: staz,etat ? ");
                    kontrakt1 = scanner.nextLine();
                    System.out.println("Podaj pensje pracownika");
                    pensja1=scanner.nextLine();
                    this.zmienKontrakt(nazwisko1, kontrakt1, pensja1);
                    break;
                case 5:
                    start = false;
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Nierozpoznana opcja menu");

            }
        }
    }

}
