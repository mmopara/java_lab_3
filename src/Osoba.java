public class Osoba {
    private String imie;
    private String nazwisko;
    private int indeks;

    public Osoba() {
    }

    public Osoba(String name, String surname, int index) {
        this.imie = name;
        this.nazwisko = surname;
        this.indeks = index;
    }

    public String getInfo() {
        return "Imie: " + this.imie + " Nazwisko: " + this.nazwisko + " Indeks: " + this.indeks;
    }
}

       /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */