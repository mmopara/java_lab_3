import java.sql.Driver;

public class Student {
    private Osoba osoba;
    private enumWydzial wydzial;

    public Student() {
    }

    public Student(Osoba osoba, enumWydzial wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public enumWydzial getWydzial() {
        return wydzial;
    }

    public void setWydzial(enumWydzial wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return "Student{" +
                "osoba=" + osoba.getInfo() +
                ", wydzial=" + wydzial +
                '}';
    }
}



        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */